package non_static_method;

public class Sample7 {

	// swapping the values of two number without using third variable
	public void swapping (int num1 , int num2)
	
	// num 1 = 30 70 40            num2= 40 30
	{
		System.out.println("Before swapping values are num1 = "+num1+"&num2 = " +num2);
		num1= num1+num2;  // num1= 30+40 = 70
		num2= num1-num2;  // num2 = 70-40 = 30
		num1= num1-num2;  // num1 = 70-30 = 40
		
		System.out.println("After swapping value are num1 = "+num1+"& num2 = "+ num2);
	}
		public static void main(String args[])
		{
			Sample7 answer = new Sample7();
			answer.swapping(30,40);
			
		}
		
		
	
		
	}
	

