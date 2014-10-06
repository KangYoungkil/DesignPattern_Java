import java.util.Date;


public abstract class Account {
	Date openningAccountDay; // 계좌개설일
	int balance; 	// 잔고
	WithdrawBehavior wh;
	Account(Date openningAccountDay, int balance)
	{
		this.openningAccountDay = openningAccountDay;
		this.balance = balance;
	}
	Account(int balance)
	{
		this.balance = balance;
		openningAccountDay = new Date();
	}

	Account(Date openningAccountDay)
	{
		this.openningAccountDay = openningAccountDay;
		balance = 0;
	}
	public void deposit(int money)
	{
		if(money>=0)
			balance+=money;
	}
	public int getBalance()
	{
		return balance;
	}
	void withdraw(int money)
	{
		balance = wh.withdraw(balance, money);
	}
	public void display()
	{
		System.out.println("현재 잔고는 " + balance + "입니다.");
	}
	public void setWithdrawBehavior(WithdrawBehavior wh)
	{
		this.wh = wh;
	}
}
