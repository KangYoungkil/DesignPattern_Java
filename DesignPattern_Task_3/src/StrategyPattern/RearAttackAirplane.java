package StrategyPattern;
public class RearAttackAirplane extends Airplane{
	public RearAttackAirplane() {
		setAttackBehvior(new RearAttackBehavior());
	}
}
