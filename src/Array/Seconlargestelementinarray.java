package Array;

import java.util.Arrays;

public class Seconlargestelementinarray {

	// Java Programm to find out second highest number in array 
	//Java program to find second largest element in Array 80
	public static void main(String[] args) 
	{
		int [] sujay= {50,40,90,80,56,32,21,78,53,45};
		Arrays.sort(sujay);
		for(int i:sujay)
		{
			System.out.print(i+" ");
		}
		int secondlarge= sujay[sujay.length-2];
		System.out.println();
		System.out.println("Second largest no : "+secondlarge);
	}


		
	}

