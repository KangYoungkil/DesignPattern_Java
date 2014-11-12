import java.rmi.RemoteException;

public class HasQuarterState implements State
{
	transient GumballMachine gm;

	public HasQuarterState(GumballMachine gm)
	{
		this.gm = gm;
	}

	public void insertQuarter()
	{
		System.out.println("이미 동전이 있습니다.");
	}

	public void enjectQuarter()
	{
		gm.setState(gm.getNoQuarterState());
	}

	public void turnCrank() throws RemoteException
{
		if (gm.getCount() != 0)
		{
			gm.setState(gm.getSoldState());
			gm.setCount(gm.getCount() - 1);
			gm.setNum_op(gm.getNum_op() + 1);
		}
		else
		{
			gm.setState(gm.getSoldOutState());
		}
	}

	public void dispense()
	{
		gm.setState(gm.getSoldState());
	}

	public String toString_()
	{
		return "has coin";
	}
}