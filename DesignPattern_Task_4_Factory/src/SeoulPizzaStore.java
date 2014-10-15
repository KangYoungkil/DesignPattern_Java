public class SeoulPizzaStore extends PizzaStore {
	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new SeoulPizzaIngredientFactory();
		if (item.equals("Kimchi")) {
			pizza = new KimchiPizza(ingredientFactory);
			pizza.setName("Seoul Style Sweetpotato Pizza");
		} else if (item.equals("Sweetpotato")) {
			pizza = new SweetpotatoPizza(ingredientFactory);
			pizza.setName("Seoul Style Sweetpotato Pizza");
		} else if (item.equals("Bulgogi")) {
			pizza = new BulgogiPizza(ingredientFactory);
			pizza.setName("Seoul Style Bulgogi Pizza");
		}
		return pizza;
	}
}