public class KimchiPizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;
	public KimchiPizza(PizzaIngredientFactory pf) {
		this.ingredientFactory = pf;
	}

	void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
	}
}