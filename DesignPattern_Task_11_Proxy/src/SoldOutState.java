public class SoldOutState implements State
{
	transient GumballMachine gm;

	public SoldOutState(GumballMachine gm)
	{
		this.gm = gm;
	}

	public void insertQuarter()
	{
		System.out.println("state is sold out");
	}

	public void enjectQuarter()
	{
		System.out.println("state is sold out");
	}

	public void turnCrank()
	{
		System.out.println("state is sold out");
	}

	public void dispense()
	{
		System.out.println("state is sold out");
	}

	public String toString_()
	{
		return "sold out";
	}
}