package StrategyPattern;
public class SideAttackAirplane extends Airplane{
	public SideAttackAirplane() {
		setAttackBehvior(new SideAttackBehavior());
	}
}