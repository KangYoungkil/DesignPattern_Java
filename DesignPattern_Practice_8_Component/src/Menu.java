import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent
{
	ArrayList menuComponents = new ArrayList(); // Collection of children
	String name, description;

	public Menu(String name, String description)
	{
		this.name = name;
		this.description = description;
	}

	public void add(MenuComponent menuComponent)
	{
		menuComponents.add(menuComponent);
	}

	public void remove(MenuComponent menuComponent)
	{
		menuComponents.remove(menuComponent);
	}

	public MenuComponent getChild(int i)
	{
		return (MenuComponent) menuComponents.get(i);
	}

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
		System.out.println(getName() + ": " + getDescription());
		Iterator iterator = menuComponents.iterator();
		while (iterator.hasNext())
		{
			MenuComponent menuComponent = (MenuComponent) iterator.next();
			menuComponent.print(); // 각 child에게 print() 위임
		}
		System.out.println();
	}
}