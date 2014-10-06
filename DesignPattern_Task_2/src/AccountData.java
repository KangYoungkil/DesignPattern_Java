import java.util.ArrayList;

public class AccountData implements Subject {
	private ArrayList<Observer> observers; // observer list
	private ArrayList<Account> accountList;
	private double interest;
	
	public AccountData() {
		observers = new ArrayList();
	}

	public void registerObserver(Observer o) {
		observers.add(o);
	}
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}

	public void notifyObservers() {
		for (Observer o : observers)
			o.updateInterest(interest);
	} // 변경 통지

	public void setMeasurements(double interest) {
		this.interest = interest;
		measurementsChanged();
	}

	public void measurementsChanged() { // WeatherData: observer들에게 변경 사항을 통지함.
		notifyObservers();
	}
	public ArrayList<Account> getAccountList() {
		return accountList;
	}
	public Account getAccount(int pos)
	{
		return accountList.get(pos);
	}
}
