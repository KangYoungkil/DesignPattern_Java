package classic;

public class MyException extends Exception{
	String errorMsg;
	MyException(String msg)
	{
		errorMsg = msg;
	}
	void showErrorMsg()
	{
		System.out.println(errorMsg);
	}
}
