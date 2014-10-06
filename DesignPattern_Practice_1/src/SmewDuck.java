
public class SmewDuck extends Duck{
	public SmewDuck(){
		flyBehavior = new FlyWithWings();
		quackBehavior = new Squeak();
	}
	public void display(){
		System.out.println("I'm a real Smew duck.");
	}

}