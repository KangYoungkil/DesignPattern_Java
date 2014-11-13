import java.rmi.RemoteException;

public class WinnerState implements State
{
	transient GumballMachine gm;

	public WinnerState(GumballMachine gm)
	{
		this.gm = gm;
	}

	public void insertQuarter()
	{
		gm.setState(gm.getHasQuarterState());
	}

	public void enjectQuarter()
	{
		System.out.println("You haven't inserted a quarter");
	}

	public void turnCrank() throws RemoteException
{
		System.out.println("Winner State!!!");
		gm.setCount(gm.getCount() - 2);
		gm.setNum_op(gm.getNum_op() + 1);
	}

	public void dispense()
	{
		System.out.println("You need to pay first");
	}

	public String toString()
	{
		return " Winner State";
	}
}