package Logical_Programme;

import java.util.Scanner;

public class String_FirstLeteerrPrint {

	// public static void main(String args[])
	
		// String str = "sjpawar35@gmail.com";
		
		
		// String[] STR1=str.split("@");
		
		// String STR2=STR1[0];
		// System.out.println(STR2);
		 
		 
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			String email = sc.nextLine();
			String username ="";
			for(int i=0;i<email.length();i++)
			{
				if(email.charAt(i) == '@')
				{
					break;
				}
				else {
					
					username+=email.charAt(i);	
				}
			}
			System.out.println(username);
		
			sc.close();
		
	
		
		
		
	}
	     
	    	 
	}

