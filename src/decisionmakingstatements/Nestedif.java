package decisionmakingstatements;

public class Nestedif {

	public static void main(String args [])
	{
		String UN="abc1";
		String PWD="xyz";
		
		if("abc"==UN)
		{
			System.out.println("correct username");
			if("xyz"==PWD)
			{	
				System.out.println("Correct password");
				System.out.println("Login successfully");
			}
			else
			{
				System.out.println("Incorrect password");
				System.out.println("Login failed");
			}
		}
		else
		{
			System.out.println("Incorrect username");
		}
	}
}


		
	
	

