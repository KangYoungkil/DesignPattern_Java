import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeineBeverageWithHook
{

	public void brew()
	{
		System.out.println("필터를 통한 커피 드립");
	}

	public void addCondiments()
	{
		System.out.println("우유와 설탕 추가");
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
		String answer = null;

		System.out.print("커피에 설탕과 우유를 추가하시겠습니까  (y/n)? ");

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