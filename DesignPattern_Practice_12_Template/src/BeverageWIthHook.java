public abstract class BeverageWIthHook
{
	public final void prepare()
	{
		boilWater();
		brew();
		pour();
		if (wantsCondiments())
		{
			addCondiments();
		}
	}

	abstract void brew();

	abstract void addCondiments();

	void boilWater()
	{
		System.out.println("물 끓이기");
	}

	void pour()
	{
		System.out.println("컵에 따르기");
	}

	boolean wantsCondiments()
	{ // hook
		return true;
	}
}