package subclass;

public class Singleton{
	protected static Singleton uniqueInstance;
	protected Singleton() {
		System.out.println("Subclass Singleton");
	}
	public static synchronized Singleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
}