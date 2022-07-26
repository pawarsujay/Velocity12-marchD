package Array;

import java.util.Arrays;

public class Example6 {

	// sort array in ascending order
	public static void main (String args[])
	{
		int [] a= {50,80,46,12,53,64,72,10};
		System.out.println("Original Array");
		for(int i:a)
		{
			System.out.print(i+" ");
		}

			// sort array in ascending order: Use sort() method from Arrays class
	        System.out.println("sorted array in ascending order");
	       Arrays.sort(a);
	       for(int i:a)
			{
				System.out.print(i+" ");
			}

}
}
