public class MiniDuckSimulator1 {

	public static void main(String[] args) {

		Duck mallard = new MallardDuck();
		mallard.display();
		mallard.performFly();
		mallard.performQuack();
		
		
		Duck rubber = new RubberDuck();
		rubber.display();
		rubber.performFly();
		rubber.performQuack();
		rubber.setFlyBehavior(new FlyRocketPowered()); // 실행 중 행위 변경
		rubber.performFly();
		rubber.performQuack();

		Duck smew = new SmewDuck();
		smew.display();
		smew.performFly();
		smew.performQuack();
	}
}