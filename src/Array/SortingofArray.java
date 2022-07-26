package Array;


import java.util.Arrays;

public class SortingofArray {

	// Sort an array in ascending order
	
		//int []a={50,80,46,12,53,64,72,10};
		
		// 10 12 46 50 53 64 72 80
		
		// sort an array in descending order
		
		// 80 72 64 53 50 46 12 10
         
	public static void main(String args[])
	{
		int []a={50,80,46,12,53,64,72,10};
		System.out.println("original array");
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		
		// sort array in ascending order: Use sort() method from Arrays class
				System.out.println();
				System.out.println("Sorted array in ascending order");

		Arrays.sort(a);
		for (int i:a)
		{
			System.out.println(i+" ");
		}
		// prin arrays in descending order
		System.out.println();
		System.out.println("sorted arrays in descending order");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
	}
}
