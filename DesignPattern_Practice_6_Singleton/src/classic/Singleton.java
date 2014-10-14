package classic;
public class Singleton {
	private static Singleton uniqueInstance; // static: 유일한 instance 보장
	// other useful instance variables here

	private Singleton() {
	} // 이 클래스 내부에서만 생성 가능

	public static Singleton getInstance() {// singleton을 보장하는 생성 메소드
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
	// other useful methods here
	void display()
	{
		System.out.println("Classic Singleton");
	}
}