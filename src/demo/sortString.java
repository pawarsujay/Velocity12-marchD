package demo;

import java.util.Arrays;

public class sortString {

	 public static void main(String[] args) 
	    { 
	        String originalString = "The quick brown fox jumps over the lazy dog"; 
	        String sortedString = "";
	        //converting string to character array
	        char tempString[] = originalString.toCharArray(); 
	        //perform sort using Arrays.sort() method
	        Arrays.sort(tempString); 
	        //storing sorted character array back to string
	        sortedString = new String(tempString); 
	        System.out.println("Original String : " + originalString); 
	        System.out.println("Sorted String : " + sortedString); 
	    } 

}