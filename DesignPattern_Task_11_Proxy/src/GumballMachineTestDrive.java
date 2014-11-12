public class GumballMachineTestDrive
{

	public static void main(String[] a)
	{
		int count = 0;

		String[] args = { "KYK", "5" };

		try
		{
			count = Integer.parseInt(args[1]);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			System.exit(1);
		}
		GumballMachine gumballMachine = new GumballMachine(args[0], count);

		GumballMonitor monitor = new GumballMonitor(gumballMachine);

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		System.out.println();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		System.out.println();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		monitor.report();
	}
}