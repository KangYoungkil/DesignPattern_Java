
public class BeverageTestDrive {
	public static void main(String[] args) {
 
		Tea tea = new Tea();
		Coffee coffee = new Coffee();
 
		System.out.println("\n차 끓이는 중 ...");
		tea.prepareRecipe();
 
		System.out.println("\n커피 끓이는 중...");
		coffee.prepareRecipe();

 
		TeaWithHook teaHook = new TeaWithHook();
		CoffeeWithHook coffeeHook = new CoffeeWithHook();
 
		System.out.println("\n차 끓이는 중...");
		teaHook.prepareRecipe();
 
		System.out.println("\n커피 끓이는 중...");
		coffeeHook.prepareRecipe();
	}
}