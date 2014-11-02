public class Waitress
{
	MenuComponent allMenus;

	public Waitress(MenuComponent allMenus)
	{
		this.allMenus = allMenus;
	}

	public void printMenu()
	{
		Iterator iterator = allMenus.createIterator();
		while (iterator.hasNext())
		{
			MenuComponent menuComponent = (MenuComponent) iterator.next();
			try
			{
				menuComponent.print();
			}
			catch (UnsupportedOperationException e)
			{}
		}

	}
}