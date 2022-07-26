package methods;

public class Swapping {

	// swapping value of two numbers 
	// num1= 10 ,  num2=20   swap number num1=20 num2=20
	
	public static void swap (int a ,int b)  // 30 ,50 
	{
		    int temp = a;  // temp =30 , a=30 ,b = 50
		   
		     a=b;  // a= 50 , b = 50
		     b=temp ;  // b = 30 , temp = 30
		     System.out.println("After swapping value are number1 "+a+ "number2 " +b);
		     
		     
		     
	}
	public static void main(String args [])
	{
		swap(30 ,50);
		
	}
	
}
