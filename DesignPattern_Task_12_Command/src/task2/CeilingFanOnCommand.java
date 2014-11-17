package task2;
class CeilingFanOnCommand implements Command
{
	CeilingFan ceilingFan;

	public CeilingFanOnCommand(CeilingFan ceilingFan)
	{
		this.ceilingFan = ceilingFan;
	}

	public void execute()
	{
		ceilingFan.high();
	}
}