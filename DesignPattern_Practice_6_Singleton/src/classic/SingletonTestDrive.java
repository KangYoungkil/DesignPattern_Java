//SingletonTestDrive.java
package classic;
class SingletonTestDrive {
	public static void main(String[] args) {
		Singleton s = Singleton.getInstance();
		Singleton s1 = Singleton.getInstance();
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s1 == Singleton.getInstance());
	}
}