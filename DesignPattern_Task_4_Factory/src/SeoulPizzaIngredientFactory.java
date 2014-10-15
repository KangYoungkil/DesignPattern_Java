public class SeoulPizzaIngredientFactory implements PizzaIngredientFactory {
	public Dough createDough() {
		return new ThinCrustDough();
	}

	public Sauce createSauce() {
		return new MarinaraSauce();
	}
}