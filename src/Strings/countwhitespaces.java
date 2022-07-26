package Strings;

public class countwhitespaces {

	public static void main (String args [])
	{
		
		// Java programme to find Total num of whitespacess in string
		String str="bquh wkjb cwjo weu324 54 5%9 4gef &%98wjheo 7yrwiui";
		// method
             
		int count = 0;
		char [] c = str.toCharArray();
		for(char s:c)
		{
			if (s == ' ')
					{
				          count++;
					}
		}
		System.out.println("No.of whitespaces: "+count);
	}
}
