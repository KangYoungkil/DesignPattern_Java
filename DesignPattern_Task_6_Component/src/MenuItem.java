public class MenuItem extends MenuComponent
{
	String name, description;
	double price;

	public MenuItem()
	{

	}
	public MenuItem(String name, String description, double price)
	{
		this.name = name;
		this.description = description;
		this.price = price;
	}

	// For composite
	public String getName()
	{
		return name;
	}

	public String getDescription()
	{
		return description;
	}

	public void print()
	{
		System.out.println(getName() + ": " + getDescription() + ": "
				+ getPrice());
	}

	// For leaf
	public double getPrice()
	{
		return price;
	}

	public Iterator createIterator()
	{

		return new NullIterator();
	}
}