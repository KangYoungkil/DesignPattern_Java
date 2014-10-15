package subclass;

public class SingletonTestDrive {
	public static void main(String[] args) {
		 Thread t1 = new Thread(HotterSingleton.getInstance());  
		  Thread t2 = new Thread(HotterSingleton.getInstance());
		  t1.run();
		  t2.run();
	}
}