package looping;

public class For_loop_Example5 {

	//program to print number from 5 to 1 => 5 4 3 2 1
		//starting point   5
		//end point         1
		//decrement operator

	public static void main(String args[])
	{
		for ( int d=5;d>=1;d--)
		{
			System.out.println(d);
		}
		
	//  Program to print in format 5 10 15 20 25 30
			//	5		35<=30  35

		for ( int N=5;N<=30;N=N+5)
		{
			System.out.println(N); // 5 ,10 , 15 , 20 , 25
		}
			
	}
	
}
