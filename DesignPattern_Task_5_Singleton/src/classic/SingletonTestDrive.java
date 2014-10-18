//SingletonTestDrive.java
package classic;
class SingletonTestDrive {
	public static void main(String[] args) throws MyException{
		
		
		SingletonThread th1 = new SingletonThread();
		SingletonThread th2 = new SingletonThread();
		SingletonThread th3 = new SingletonThread();
		SingletonThread th4 = new SingletonThread();
		SingletonThread th5 = new SingletonThread();

		th1.setNum(1);
		th2.setNum(2);
		th3.setNum(3);
		th4.setNum(4);
		th5.setNum(5);

		th1.setInstanceNum(1);
		th2.setInstanceNum(1);
		th3.setInstanceNum(1);
		th4.setInstanceNum(2);
		th5.setInstanceNum(2);
		
		th1.start();
		th2.start();
		th3.start();
		th4.start();
		th5.start();
	}
}