
public class StatisticsInterestDisplay implements Observer, DisplayElement{

	private Subject accountData; // 이 클래스에서 사용되지 않으나 “탈퇴”시 필요
	
	double minInterest;
	double maxInterest;
	double interestSum;
	int numReadings;
	public StatisticsInterestDisplay(Subject accountData) {
		this.accountData = accountData;
		accountData.registerObserver(this);
	}
	public void display() {
		System.out.printf("Avg/Max/Min interest = %f / %f/ %f\n",(interestSum / numReadings),maxInterest,minInterest);
	}
	public void updateInterest(double rate) {
		interestSum += rate;
		numReadings++;
		if (rate > maxInterest) {
			maxInterest = rate;
		}

		if (rate < minInterest) {
			minInterest = rate;
		}
		display();
	}
}
