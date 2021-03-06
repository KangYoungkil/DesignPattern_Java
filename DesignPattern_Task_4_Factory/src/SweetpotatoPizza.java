//SweetpotatoPizza.java
public class SweetpotatoPizza extends Pizza {

	PizzaIngredientFactory ingredientFactory;
	public SweetpotatoPizza(PizzaIngredientFactory pf) {
		this.ingredientFactory = pf;
	}
	void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
	}
}