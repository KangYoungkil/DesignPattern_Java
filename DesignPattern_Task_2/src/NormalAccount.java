import java.util.Date;


public class NormalAccount extends Account{
	
	NormalAccount(Date openningAccountDay, int balance)
	{
		super(openningAccountDay,balance);
		setWithdrawBehavior(new NormalAccountWithdraw());
	}
	NormalAccount(int balance)
	{
		super(balance);
		setWithdrawBehavior(new NormalAccountWithdraw());
	}

	NormalAccount(Date openningAccountDay)
	{
		super(openningAccountDay);
		setWithdrawBehavior(new NormalAccountWithdraw());
	}
}
