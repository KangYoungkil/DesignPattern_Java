package DecoratorPattern;
public class RearAttackAirplane extends AirplaneDecorator{
	public String attack() {
		return airplane.attack() + ", RearAttack";
	}
	
	public RearAttackAirplane(Airplane airplane) {
		this.airplane = airplane;
	}
}
