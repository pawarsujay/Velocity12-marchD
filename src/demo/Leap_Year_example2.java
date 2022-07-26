package demo;

public class Leap_Year_example2 {

	public static void main(String args [])
	{
		int Year = 1996;
		if ((Year%400==0)||((Year%4==0)&&(Year%100!=0)))
		{
			System.out.println(Year+"is a Leap Year");
		}
		else
		{
			System.out.println("is Not a Leap Year");
		}
	}
}
