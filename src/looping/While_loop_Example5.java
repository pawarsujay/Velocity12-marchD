package looping;

public class While_loop_Example5 {

	public static void main(String args[] )
	{
		int number = 8;
		int fact= 1;
		
		int r = 8;
		
		while(r>=1)
		{
			fact=r*fact;
			r--;
		}
		System.out.println("Factorial of" + number  + "is" + fact);
		
	}
}
