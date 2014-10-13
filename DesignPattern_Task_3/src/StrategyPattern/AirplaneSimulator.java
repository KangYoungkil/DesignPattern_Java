package StrategyPattern;
public class AirplaneSimulator {
	public static void main(String args[])
	{
		Airplane strategy = new FrontAttackAirplane();
		strategy.performAttack();
		strategy.setAttackBehvior(new RearAttackBehavior());
		strategy.performAttack();
		strategy = new FrontAttackAirplane();
		strategy.performAttack();
		strategy = new RearAttackAirplane();
		strategy.performAttack();
		
	}
}
