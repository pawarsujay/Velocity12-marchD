package Array;

import java.util.Arrays;

public class checkarrayequality {

	//Java program to check two arrays are equal or not
		public static void main(String[] args) 
		{
			int [] arr1= {10,50,40,30,56,41};
			int [] arr2= {10,50,40,30,20,41};
			int [] arr3= {10,50,40,30,56,41};
			
			System.out.println(Arrays.equals(arr1, arr2));// false
			System.out.println(Arrays.equals(arr2, arr3));// false
			System.out.println(Arrays.equals(arr1, arr3));// true		
		}

}
