package Strings;

public class palindrome_string {

	//Java program to check the given string is Palindrome string NAVJIVAN=NAVJIVAN
	public static void main(String args [])
	{
		String BTR = "NAVAN";   //yticolev
		String ST = "";
		
		// i=7 6 5 4 3 2 1 0 -1
		for (int j=BTR.length()-1;j>=0;j--)
		{
			ST= ST+BTR.charAt(j);
		}
		System.out.println("Original String: "+BTR);
		System.out.println("Reverse String: "+ST);
		if (BTR.equalsIgnoreCase(ST))
		{
			System.out.println(BTR+" is palindrome string");
		}
		else
		{
			System.out.println(BTR+" is not palindrome string");
		}

	}
}
