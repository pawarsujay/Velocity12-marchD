package looping;

public class While_loop_Example4 {

	
		//Program to find factorial of given number
		//4!= 4*3*2*1= 24
		//starting point 4
		//end point      1
		//decrement
		public static void main(String[] args) 
		{
			int number=4;
			int fact=1;//1 4 12 24 24
			
			int i=4;// 4
			
			//0>=1
			while(i>=1)
			{
				// fact= 4*1=4  3*4=12  2*12=24  1*24=24
				fact=i*fact;		
				i--;//0		
			}
			System.out.println("Factorial of "+number+" is "+fact);
				
		}
	}

	

