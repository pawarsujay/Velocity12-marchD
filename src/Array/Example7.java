package Array;

import java.util.Arrays;

public class Example7 {

     public static void main(String args[])
     {
    	 String [] str= {"Priya","Neha","suresh","Kajal","Pankaj","Aarti"};
 		System.out.println("Original array: ");
             for(String s:str)
             {
            	 System.out.println(s+" ");
             }
             // sort array in ascending order
             // Aarati , Kajal Neha Pankaj Priya Suresh
             System.out.println();
             System.out.println("sorted array in ascending order");
             Arrays.sort(str);
             for(String s: str)
             {
            	 System.out.println(s+"");
             }
     }
}
