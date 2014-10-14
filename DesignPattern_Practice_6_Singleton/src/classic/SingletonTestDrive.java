package classic;

public class SingletonTestDrive {
	public static void main(String[] args) {
		Singleton foo = Singleton.getInstance();
		System.out.println(foo);
	}
}