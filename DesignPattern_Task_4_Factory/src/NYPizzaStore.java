public class NYPizzaStore extends PizzaStore {
	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory pf = new NYPizzaIngredientFactory();
		if (item.equals("cheese")) {
			pizza = new CheesePizza(pf);
			pizza.setName("New York Style Cheese Pizza");
		} else if (item.equals("veggie")) {
			pizza = new VeggiePizza(pf);
			pizza.setName("New York Style Veggie Pizza");
		} else if (item.equals("clam")) {
			pizza = new ClamPizza(pf);
			pizza.setName("New York Style Clam Pizza");
		} else if (item.equals("pepperoni")) {
			pizza = new PepperoniPizza(pf);
			pizza.setName("New York Style Pepperoni Pizza");
		}
		return pizza;
	}
}