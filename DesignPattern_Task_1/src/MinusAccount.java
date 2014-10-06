import java.util.Date;

public class MinusAccount extends Account {
	private char credit;
	MinusAccount(Date openningAccountDay, int balance) {
		super(openningAccountDay, balance);
		judgeCredit();
	}

	MinusAccount(int balance) {
		super(balance);
		judgeCredit();
	}

	MinusAccount(Date openningAccountDay) {
		super(openningAccountDay);
		judgeCredit();
	}
	void setCredit(char credit)
	{
		switch(Character.toUpperCase(credit))
		{
		case 'A':
			setWithdrawBehavior(new MinusAccountWithdraw('A'));
			this.credit = Character.toUpperCase(credit);
			break;
		case 'B':
			setWithdrawBehavior(new MinusAccountWithdraw('B'));
			this.credit = Character.toUpperCase(credit);
			break;
		case 'C':
			setWithdrawBehavior(new MinusAccountWithdraw('C'));
			this.credit = Character.toUpperCase(credit);
			break;
		default:
				break;
		}
	}
	void judgeCredit()
	{
		if(10000000<=balance)
			setCredit('A');
		else if(5000000<=balance&&balance<10000000)
			setCredit('B');
		else
			setCredit('C');
	}
	
	public void display()
	{
		System.out.println("Minus 통장 ---");
		System.out.println("현재 잔고 :  " + balance + " 신용등급 : " + credit);
	}
	
}
