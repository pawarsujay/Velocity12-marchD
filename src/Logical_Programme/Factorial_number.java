package Logical_Programme;

public class Factorial_number {

	  public static void main(String args [])
	  {
		 int number = 10;
		 int factorial = number;
		 
		 for (int i = (number-1);i>1;i--)
		 {
			 factorial= factorial * i;
		  }
		  System.out.println("factorial of"+number+"is"+factorial);
	  }
}
