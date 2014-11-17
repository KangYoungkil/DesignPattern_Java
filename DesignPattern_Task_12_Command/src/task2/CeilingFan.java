package task2;

class CeilingFan
{
	String location = "";
	int level;
	public static final int HIGH = 2, MEDIUM = 1, LOW = 0;

	public CeilingFan(String location)
	{
		this.location = location;
	}

	public void high()
	{
		level = HIGH;
		System.out.println(location + " ceiling fan is on high");
	}

	public void medium()
	{
		level = MEDIUM;
		System.out.println(location + " ceiling fan is on medium");
	}

	public void low()
	{
		level = LOW;
		System.out.println(location + " ceiling fan is on low");
	}

	public void off()
	{
		level = 0;
		System.out.println(location + " ceiling fan is off");
	}

	public int getSpeed()
	{
		return level;
	}
}