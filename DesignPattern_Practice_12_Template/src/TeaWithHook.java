import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TeaWithHook extends CaffeineBeverageWithHook
{

	public void brew()
	{
		System.out.println("차 끓이기");
	}

	public void addCondiments()
	{
		System.out.println("레몬 추가");
	}

	public boolean customerWantsCondiments()
	{

		String answer = getUserInput();

		if (answer.toLowerCase().startsWith("y"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	private String getUserInput()
	{
		// get the user's response
		String answer = null;

		System.out.print("레몬을 추가 하시겠습니까 (y/n)? ");

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try
		{
			answer = in.readLine();
		}
		catch (IOException ioe)
		{
			System.err.println("입력오류 y or n 만 입력해주세요");
		}
		if (answer == null)
		{
			return "no";
		}
		return answer;
	}
}