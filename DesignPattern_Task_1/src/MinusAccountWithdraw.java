
public class MinusAccountWithdraw implements WithdrawBehavior{
	private int limitedMoney;
	public MinusAccountWithdraw(char credit) {
		// TODO Auto-generated constructor stub
		switch(Character.toUpperCase(credit))
		{
		case 'A':
			limitedMoney = 10000000; // 1000
			break;
		case 'B':
			limitedMoney = 5000000; // 500
			break;
		case 'C':
			limitedMoney = 1000000; // 100
			break;
		default:
				break;
		}
		
	}
	public int withdraw(int balance, int money) {
		// TODO Auto-generated method stub
		if( (balance+limitedMoney)>= money)
		{
			limitedMoney-=money;
			balance = 0;
		}
		else
		{
			System.out.println("신용 한도액을 초과했습니다.");
			return balance;
		}
		
		display();
		return balance;
	}
	public int getLimitedMoney(){return limitedMoney;}
	public void display()
	{
		System.out.println("잔여 한도액 : " + limitedMoney);
	}
}
