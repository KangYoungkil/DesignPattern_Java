public class NoQuarterState implements State
{
	transient GumballMachine gm;

	public NoQuarterState(GumballMachine gm)
	{
		this.gm = gm;
	}

	public void insertQuarter()
	{
		if ((gm.getNum_op()) % 10 == 0) gm.setState(gm.getWinnerState());
		else gm.setState(gm.getHasQuarterState());
	}

	public void enjectQuarter()
	{
		System.out.println("You haven't inserted a quarter");
	}

	public void turnCrank()
	{
		System.out.println("You turned, but there's no quarter");
	}

	public void dispense()
	{
		System.out.println("You need to pay first");
	}

	public String toString()
	{
		return "waiting for quarter";
	}
}