package Logical_Programme;

public class Count_Vowels {

	 

	public static void main(String[] args) {    
         
	        //Counter variable to store the count of vowels and consonant    
	        int vCount = 0, cCount = 0;    
	            
	        //Declare a string    
	        String str = "This is a really simple sentence";    
	            
	        //Converting entire string to lower case to reduce the comparisons    
	        str = str.toLowerCase();
	        
	        for(int i = 0; i < str.length(); i++)
	        {    	        	char ch = str.charAt(i);

	            //Checks whether a character is a vowel
	    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){    
	                //Increments the vowel counter    
	                vCount++;    
	            }    
	            //Checks whether a character is a consonant    
	            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {      
	                //Increments the consonant counter    
	                cCount++;    
	            }    
	        }    
	        System.out.println("Number of vowels: " + vCount);    
	        System.out.println("Number of consonants: " + cCount);    
	    }    
	}

