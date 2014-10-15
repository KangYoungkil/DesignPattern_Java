public class PizzaTestDrive {

	public static void main(String[] args) {
		PizzaStore gumiStore = new GumiPizzaStore();
		PizzaStore seoulStore = new SeoulPizzaStore();
		PizzaStore deaguStore = new DaeguPizzaStore();
		Pizza pizza;
		pizza = gumiStore.orderPizza("Kimchi");
		System.out.println("Ethan ordered a " + pizza + "\n");
		pizza = seoulStore.orderPizza("Bulgogi");
		pizza = deaguStore.orderPizza("Sweetpotato");
		
		System.out.println("Joel ordered a " + pizza + "\n");
		pizza = gumiStore.orderPizza("Bulgogi");
		
		System.out.println("Ethan ordered a " + pizza + "\n");
		pizza = seoulStore.orderPizza("Bulgogi");
		
		System.out.println("Joel ordered a " + pizza + "\n");
		pizza = deaguStore.orderPizza("Kimchi");
		System.out.println("Ethan ordered a " + pizza + "\n");
		pizza = deaguStore.orderPizza("Sweetpotato");
		System.out.println("Joel ordered a " + pizza + "\n");
		pizza = seoulStore.orderPizza("Bulgogi");
		System.out.println("Ethan ordered a " + pizza + "\n");
		pizza = gumiStore.orderPizza("Kimchi");
		System.out.println("Joel ordered a " + pizza + "\n");
	}
}