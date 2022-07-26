package demo;

public class Leap_Year {

	public static void main(String args [])
	{
		// The Desired Year check
		int Year = 1996 ;
		
		// Implementing our algorithm
		if (Year%400==0)
		{
			System.out.println(Year+"is a Leap Year.");
		}
		else if(Year % 100 == 0)
		{
			System.out.println(Year+"is a Not Leap Year");
		}
		else if (Year%4==0)
		{
			System.out.println(Year+"is a Leap Year");
		}
		else
		{
			System.out.println("is a Not Leap Year");
		}
	}
}
