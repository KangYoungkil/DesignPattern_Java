//DaeguPizzaIngredientFactory.java
public class DaeguPizzaIngredientFactory implements PizzaIngredientFactory {
	public Dough createDough() {
		return new ThinCrustDough();
	}
	public Sauce createSauce() {
		return new MarinaraSauce();
	}
}