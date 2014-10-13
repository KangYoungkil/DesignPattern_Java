package DecoratorPattern;

class SideAttackAirplane extends AirplaneDecorator{
	public String attack() {
		return airplane.attack() + ", SideAttack";
	}
	public SideAttackAirplane(Airplane airplane) {
		this.airplane = airplane;
	}

}
