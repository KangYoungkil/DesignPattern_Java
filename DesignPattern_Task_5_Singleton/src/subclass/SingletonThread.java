package subclass;
public class SingletonThread extends Thread {
	private Singleton sl;
	private int num =0;
	private int instanceNum = 0;
	private String type;
	
	public void run() {

		try {
			if(type.equals("Single"))
				sl = Singleton.getInstance(instanceNum);
			else if(type.equals("HotterSingleton"))
				sl = Singleton.getInstance(instanceNum);
			else if(type.equals("CoolerSingleton"))
				sl = Singleton.getInstance(instanceNum);
			System.out.println(num + "번 쓰레드 : " + sl.toString());
		} catch (Exception e) {
			System.out.println(num +"번 쓰레드 : ");
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
	public void setType(String type)
	{
		this.type = type;
	}
}
