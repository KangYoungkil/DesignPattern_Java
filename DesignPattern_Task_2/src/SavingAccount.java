import java.util.Date;

public class SavingAccount extends Account {
	
	Date expirationDate;
	
	SavingAccount(Date openningAccountDay, int balance) {
		super(openningAccountDay, balance);
		expirationDate = openningAccountDay;
		expirationDate.setYear(expirationDate.getYear()+2);
		setWithdrawBehavior(new SavingAccountWithdraw(expirationDate));
	}

	SavingAccount(int balance) {
		super(balance);
		this.openningAccountDay = new Date();
		expirationDate = openningAccountDay;
		expirationDate.setYear(expirationDate.getYear()+2);
		setWithdrawBehavior(new SavingAccountWithdraw(expirationDate));
	}

	SavingAccount(Date openningAccountDay) {
		super(openningAccountDay);
		expirationDate = openningAccountDay;
		expirationDate.setYear(expirationDate.getYear()+2);
		setWithdrawBehavior(new SavingAccountWithdraw(expirationDate));
		
	}
	public void display()
	{
		System.out.println("적금 통장 ----");
		System.out.println("현재 잔고 " + balance + " 계약 만료일 : " + expirationDate);
	}
	
}
