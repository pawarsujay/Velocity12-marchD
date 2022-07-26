package Pyramid;

public class Daimond {

	public static void main(String args[])
	{
		int star = 1, space = 4 , star2 = 7 , space2 = 1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for (int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			star=star+2;
			space--;
			
		}
		for (int i=1;i<=5;i++)
		{
			for(int j=1;j<space2;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star2;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			star2=star2-2;
			space2++;
		}
	}
}
