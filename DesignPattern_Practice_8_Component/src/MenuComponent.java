public abstract class MenuComponent
{
	// 공통
	public String getName()
	{
		throw new UnsupportedOperationException();
	}

	public void print()
	{
		throw new UnsupportedOperationException();
	}

	public String getDescription()
	{
		throw new UnsupportedOperationException();
	}

	// For composite
	public void add(MenuComponent menuComponent)
	{
		throw new UnsupportedOperationException();
	}

	public void remove(MenuComponent menuComponent)
	{
		throw new UnsupportedOperationException();
	}

	public MenuComponent getChild(int i)
	{
		throw new UnsupportedOperationException();
	}

	// For leaf
	public double getPrice()
	{
		throw new UnsupportedOperationException();
	}
}