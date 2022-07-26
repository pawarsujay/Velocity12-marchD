package looping;

public class For_loop_Example6 {

	// program to print even and odd numbers from 50 to 10
		//starting point 50
		//end point      10
		//decrement operator

	public static void main(String args [])
	{
		//50        9>=10	9
		for(int h=50;h>=1;h--)
		{
			//10%2==0 true
			if (h%2==0)
			{
				System.out.println(h+"is even number");
			}
			else
			{
				System.out.println(h+"is odd number");
			}
				
				
		}
		
	}
	
}
