public class Mocha extends CondimentDecorator {
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	} // Composition

	public String getDescription() {
		return beverage.getDescription() + ", Mocha"; // Delegation + 추가 연산
	}

	public double cost() {
		return .20 + beverage.cost();
	} // Delegation + 추가 연산
}