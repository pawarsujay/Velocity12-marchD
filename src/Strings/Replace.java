package Strings;

public class Replace {

	public static void main(String args[])
	{
		String B="hgedh82gdiduho 92039 hd 880 3 29hiwjho7298yn";
		
		// replace
		String H=B.replace("h", "z");
		System.out.println(H);
		
		// replace First.
		System.out.println(H.replaceFirst("d", "s"));
		
		// replace all 
		// java programme to print only number to given String
		
		String result=B.replaceAll("[^0-9]","");
		System.out.println(result);

	}
}
