package task2;
class CeilingFanOffCommand implements Command
{
	CeilingFan ceilingFan;

	public CeilingFanOffCommand(CeilingFan ceilingFan)
	{
		this.ceilingFan = ceilingFan;
	}

	public void execute()
	{
		ceilingFan.off();
	}
}