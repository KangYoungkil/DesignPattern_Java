public class MallardDuck extends Duck {
	public MallardDuck() {
		flyBehavior = new FlyWithWings(); // 자신의 행동 설정
		quackBehavior = new Quack();
	}

	public void display() {
		System.out.println("I'm a real Mallard duck");
	}
}