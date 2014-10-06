
public class Whip extends CondimentDecorator{
	Whip(Beverage b)
	{
		beverage = b;
	}
	public double cost() {
		return beverage.cost() + .3;
	}
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}
}
