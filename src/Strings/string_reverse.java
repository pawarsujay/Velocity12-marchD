package Strings;

public class string_reverse {

	// Java programme to reverse string
	public static void main(String args [])
	{
		String T = "Velocity";   //yticolev
		String S = "";
		
		// i=7 6 5 4 3 2 1 0 -1
		for (int i=T.length()-1;i>=0;i--)
		{
			S= S+T.charAt(i);
		}
		System.out.println("Original String: "+T);
		System.out.println("Reverse String: "+S);

	}
}
