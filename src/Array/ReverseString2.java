package Array;

public class ReverseString2 
{
    public static void main(String[] args) 
    {    
        String ss = "Karishma";    
        //Stores the reverse of given string    
        String reversedStr = "";    
            
        //Iterate through the string from last and add each character to variable reversedStr    
        for(int i = ss.length()-1; i >= 0; i--){    
            reversedStr = reversedStr + ss.charAt(i);    
        }    
            
        System.out.println("Original string: " + ss);    
        //Displays the reverse of given string    
        System.out.println("Reverse of given string: " + reversedStr);    
    }    
}   