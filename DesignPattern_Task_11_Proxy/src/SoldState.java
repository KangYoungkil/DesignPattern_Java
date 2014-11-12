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
		System.out.println("동전을 넣어주세요");
		gm.setState(gm.getNoQuarterState());
	}

	public void turnCrank()
	{
		System.out.println("동전을 넣어주세요");
		gm.setState(gm.getNoQuarterState());
	}

	public void dispense()
	{
		System.out.println("동전을 넣어주세요");
		gm.setState(gm.getNoQuarterState());
	}

	public String toString_()
	{
		return "sold";
	}
}