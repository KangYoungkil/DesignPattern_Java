package classic;
public class SingletonThread extends Thread {
	private Singleton sl;
	private int num =0;
	private int instanceNum = 0;
	
	public void run() {
		try {
			sl = Singleton.getInstance(instanceNum);
			System.out.println(num + "번 쓰레드 : " + sl.toString());
		} catch (Exception e) {

		}
	}
	public void setNum(int n) {
		num = n;
	}
	public void setInstanceNum(int n)
	{
		instanceNum = n;
	}

	public void setSingleton(Singleton sl2) {
		this.sl = sl2;
	}
}
