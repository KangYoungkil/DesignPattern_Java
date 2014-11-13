public class SoldState implements State
{
	transient GumballMachine gm;

	public SoldState(GumballMachine gm)
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
		System.out.println("Sorry, you already turned the crank");
		gm.setState(gm.getNoQuarterState());
	}

	public void turnCrank()
	{
		System.out.println("Turning twice doesn't get you another gumball!");
		gm.setState(gm.getNoQuarterState());
	}

	public void dispense()
	{
		System.out.println("Oops, out of gumballs!");
		gm.setState(gm.getNoQuarterState());
	}

	public String toString()
	{
		return "dispensing a gumball";
	}
}