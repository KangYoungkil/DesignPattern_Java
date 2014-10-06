
public class NormalAccountWithdraw implements WithdrawBehavior{

	public int withdraw(int balance, int money) {
		if(balance>=money)
			balance -= money;
		else
			System.out.println("잔액이 부족합니다.");
		return balance;
	}

}
