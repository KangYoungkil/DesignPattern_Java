public class ChicagoPizzaStore extends PizzaStore {

	Pizza createPizza(String item) {
		if (item.equals("cheese"))
			return new ChicagoStyleCheesePizza();
		else if (item.equals("clam"))
			return new ChicagoStyleClamPizza();
		else
			return null;
	}
}