package Strings;

public class CountOccurences {

	// using string library method
	public static void main(String args[])
	{
		String input = "selenium";
		char search = 'e';
		
		int count =0;
		
		for(int i=0;i<input.length();i++)
		{
			if (input.charAt(i)==search)
				count++;
		}
		System.out.println("The Character '"+search+"' appears "+count+" times.");
	}
}
