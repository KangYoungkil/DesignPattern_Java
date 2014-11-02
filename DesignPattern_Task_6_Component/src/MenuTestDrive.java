public class MenuTestDrive
{
	public static void main(String args[])
	{
		MenuComponent pancakeHouseMenu = new PancakeHouseMenu(
				"PANCAKE HOUSE MENU",
				"Breakfast");
		MenuComponent dinerMenu = new DinerMenu("DINER MENU", "Lunch");
		MenuComponent cafeMenu = new CafeMenu("CAFE MENU", "Dinner");

		MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");
		allMenus.add(pancakeHouseMenu);
		allMenus.add(dinerMenu);
		allMenus.add(cafeMenu);
		pancakeHouseMenu.add(new MenuItem("팬케이크", "달걀과 토스트", 2.99));
		Waitress waitress = new Waitress(allMenus);
		waitress.printMenu();
	}
}