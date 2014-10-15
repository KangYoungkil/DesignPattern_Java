package classic;
public class SingletonTestDrive {
	public static void main(String[] args) {
		 Thread t1; 
		 Thread t2;
		 while(true)
		 {
			 t1 = new Thread(Singleton.getInstance());
			 t1.run();
			 t2 = new Thread(Singleton.getInstance());
			 t2.run();
		 }
	}
}