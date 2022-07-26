package decisionmakingstatements;

public class elseifdemo {

	public static void main(String args [])
	{
		int marks=65;
		if (marks >= 75) // condition 1 
		{
			System.out.println("Distinction");
		}
		else if (marks >=60) // condition 2
		{
			System.out.println("First Class");
		}
		else if (marks >= 50) // condition 3
		{
			System.out.println("Second Class");
		}
		else 
		{
			System.out.println("Fail");
		}
	}
	
}
