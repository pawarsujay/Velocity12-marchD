package Logical_Programme;

import java.util.Scanner;

public class Table2 {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number=");
		
		int b=sc.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(i*b);
		}
	}
}
