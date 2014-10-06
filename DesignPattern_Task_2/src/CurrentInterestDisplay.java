public class CurrentInterestDisplay implements Observer, DisplayElement {
	private Double interest;
	private Subject accountData; // 이 클래스에서 사용되지 않으나 “탈퇴”시 필요

	public CurrentInterestDisplay(Subject accountData) {
		this.accountData = accountData;
		accountData.registerObserver(this);
	}
	public void display() {
		System.out.println("Current interest: " + interest);
	}

	public void updateInterest(double interest) {
		// TODO Auto-generated method stub
		this.interest = interest;
		display();
	}
}
