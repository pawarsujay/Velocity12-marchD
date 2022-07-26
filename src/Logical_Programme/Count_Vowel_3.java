package Logical_Programme;

public class Count_Vowel_3 {

	public static void main(String args[])
	{
		int vcount=0;
		String SSP = "My Name Is Rameshwar Sukhadeo Pawar";
		
		 SSP.toLowerCase();
		 
		 for(int i=0 ;i<SSP.length();i++)
		 {
			 char ch = SSP.charAt(i);
		 
		 if ( ch == 'a' || ch == 'e'|| ch == 'i'|| ch ==  'o' || ch == 'u'); 
			 
		 vcount++;
		
		 
		 }
		 System.out.println("Number of Vowels :"+ vcount);
		 }
	}	 
