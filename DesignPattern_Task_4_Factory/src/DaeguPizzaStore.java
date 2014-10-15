public class DaeguPizzaStore extends PizzaStore {
	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new DaeguPizzaIngredientFactory();
		if (item.equals("Kimchi")) {
			pizza = new KimchiPizza(ingredientFactory);
			pizza.setName("Daegu Style Sweetpotato Pizza");
		} else if (item.equals("Sweetpotato")) {
			pizza = new SweetpotatoPizza(ingredientFactory);
			pizza.setName("Daegu Style Sweetpotato Pizza");
		} else if (item.equals("Bulgogi")) {
			pizza = new BulgogiPizza(ingredientFactory);
			pizza.setName("Daegu Style Bulgogi Pizza");
		}
		return pizza;
	}
}