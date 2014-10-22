public class Waitress {
	Menu pancakeHouseMenu;
	Menu dinerMenu;

	public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
	}

	public void printMenu() {
		Iterator panIterator = pancakeHouseMenu.createIterator();
		Iterator dineIterator = dinerMenu.createIterator();
		System.out.println("메뉴\n----\n아침 메뉴");
		printMenu(panIterator);
		System.out.println("\n저녁 메뉴");
		printMenu(dineIterator);

	}

	private void printMenu(Iterator iterator)
	{
		while (iterator.hasNext()) {
			MenuItem menuItem = ((MenuItem) iterator.next());
			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());
		}
	}

}