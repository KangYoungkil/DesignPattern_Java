package subclass;

public class Singleton implements Runnable {
	protected static Singleton uniqueInstance;

	// other useful instance variables here
	protected Singleton() {
		System.out.println("Subclass Singleton");
	}

	public static synchronized Singleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}

	// other useful methods here
	public void run() {
		try {getInstance();}
		catch (Exception e) {}
	}

}