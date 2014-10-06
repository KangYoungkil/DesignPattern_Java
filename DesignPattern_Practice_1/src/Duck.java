public abstract class Duck {
	FlyBehavior flyBehavior; // (Polymorphic) Composition
	QuackBehavior quackBehavior; 
	public Duck() {
	}

	public void setFlyBehavior(FlyBehavior fb) { // 실행 중 행동 변경
		flyBehavior = fb;
	}
	public void setQuackBehavior(QuackBehavior qb)
	{
		quackBehavior = qb;
	}
	
	abstract void display();

	public void performFly() {
		flyBehavior.fly();
	} // 자신의 행동 실행
	
	public void performQuack(){
		quackBehavior.quack();
	} // 자신의 행동 실
	
	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}
}