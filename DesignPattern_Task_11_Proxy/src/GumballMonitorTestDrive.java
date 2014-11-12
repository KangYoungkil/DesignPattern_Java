import java.rmi.Naming;

public class GumballMonitorTestDrive
{
	public static void main(String[] args)
	{
		GumballMonitor monitor = null;
		try
		{
			GumballMachineRemote machine = (GumballMachineRemote) Naming
					.lookup("rmi://127.0.0.1/gumballmachine");
			monitor = new GumballMonitor(machine);
			System.out.println(monitor);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		monitor.report();
	}
}