public class CheesePizza extends Pizza {

	PizzaProductFactory productFactory;

	public CheesePizza(PizzaProductFactory pf) {
		this.productFactory = pf;
	}

	void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
	}
}