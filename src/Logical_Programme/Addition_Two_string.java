package Logical_Programme;

import java.math.BigInteger;

public class Addition_Two_string {

	public static void main(String args[])
	{
		String a = "10";
		String b = "20";
		
		BigInteger aa= new BigInteger (a);
		BigInteger bb = new BigInteger (b);
		
		System.out.println(aa.add(bb));
	}
}
