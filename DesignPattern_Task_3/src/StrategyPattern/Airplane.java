package StrategyPattern;
public abstract class Airplane{
	AttackBehavior attackBehvior;
	public Airplane() {}
	void setAttackBehvior(AttackBehavior ab) {
		attackBehvior = ab;
	}
	void performAttack() {
		System.out.println("Attack : " + attackBehvior.attack());
	}
}