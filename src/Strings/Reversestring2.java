package Strings;

public class Reversestring2 {

	public static void main(String args[])
	{
		String show= "SELENIUM";
		
		String reverse= "";
		
		for (int i=show.length()-1;i>=0;i--)
		{
			reverse= reverse+show.charAt(i);
		}
		System.out.println("original Array" +" "+show);
		System.out.println("Reverse String "+reverse);
	}
	
}
