import java.util.Date;


public class SavingAccountWithdraw implements WithdrawBehavior{

	Date expirationDate;
	SavingAccountWithdraw(Date expirationDate)
	{
		this.expirationDate = expirationDate;
	}
	public int withdraw(int balance, int money) {
		// TODO Auto-generated method stub

		if(new Date().after(expirationDate))
		{
			if(balance>=money)
				balance-=money;
			else
				System.out.println("잔액이 부족합니다.");
		}
		else
			System.out.println("계약 만료일이 지나지 않았습니다.");
		return balance;
	}

}
