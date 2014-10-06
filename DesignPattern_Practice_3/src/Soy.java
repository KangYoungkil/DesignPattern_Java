
public class Soy extends CondimentDecorator{ // 간
	Soy(Beverage b)
	{
		beverage  = b;
	}
	public double cost() {
		return beverage.cost() + .2;
	}
	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

}
