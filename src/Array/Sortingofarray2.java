package Array;

import java.util.Arrays;

public class Sortingofarray2
{
	
		public static void main(String[] args) 
		{
			String [] str= {"Priya","Neha","suresh","Kajal","Pankaj","Aarti"};
			System.out.println("Original array: ");
			for(String s: str)
			{
				System.out.print(s+" ");
			}
			
			//sort array in ascending order
			// Aarti  Kajal Neha Pankaj Priya Suresh
			System.out.println();
			System.out.println("Sorted array in ascending order");
			Arrays.sort(str);
			for(String s:str)
			{
				System.out.print(s+" ");
			}
			
			//sort array in descending order
			System.out.println();
			System.out.println("Sorted array in descending order");
			for(int i=str.length-1;i>=0;i--)
			{
				System.out.print(str[i]+" ");
			}
		}
	}


