public class BulgogiPizza extends Pizza {

	PizzaIngredientFactory ingredientFactory;
	public BulgogiPizza(PizzaIngredientFactory pf) {
		this.ingredientFactory = pf;
	}
	void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
	}
}