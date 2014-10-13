package StrategyPattern;

public class FrontAttackAirplane extends Airplane{
	public FrontAttackAirplane() {
		setAttackBehvior(new FrontAttackBehavior());
	}
}
