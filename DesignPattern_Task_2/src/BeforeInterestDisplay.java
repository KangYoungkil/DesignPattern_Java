
public class BeforeInterestDisplay implements Observer, DisplayElement{

	Double currentInterest;  
	Double lastInterset;
	private Subject accountData; // 이 클래스에서 사용되지 않으나 “탈퇴”시 필요

	public BeforeInterestDisplay(Subject accountData) {
		this.accountData = accountData;
		accountData.registerObserver(this);
		currentInterest = lastInterset = 0.0;
	}
	public void display() {
		System.out.println("BeforeRate: ");
		if (currentInterest > lastInterset) 
			System.out.println("The increasing interest!");
		else if (currentInterest == lastInterset) 
			System.out.println("More of the same");
		else if (currentInterest < lastInterset) 
			System.out.println("The decreaseing interest.....");
	}

	public void updateInterest(double interest) {
		// TODO Auto-generated method stub
		lastInterset = currentInterest;
		currentInterest = interest;
		display();
	}
	
}
