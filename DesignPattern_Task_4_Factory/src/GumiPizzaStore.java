//GumiPizzaStore.java
public class GumiPizzaStore extends PizzaStore {
	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new GumiPizzaIngredientFactory();

		if (item.equals("Kimchi")) {
			pizza = new KimchiPizza(ingredientFactory);
			pizza.setName("Gumi Style Sweetpotato Pizza");
		} else if (item.equals("Sweetpotato")) {
			pizza = new SweetpotatoPizza(ingredientFactory);
			pizza.setName("Gumi Style Sweetpotato Pizza");
		} else if (item.equals("Bulgogi")) {
			pizza = new BulgogiPizza(ingredientFactory);
			pizza.setName("Gumi Style Bulgogi Pizza");
		}
		return pizza;
	}
}