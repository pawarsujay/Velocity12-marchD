package demo;

public class Fibonacci_Series {

	public static void main(String args[])
	{
		int n = 10 , firstTerm=0, secondterm=1;
		
		System.out.println("Fibonacci Series Till "+ n + " terms ");
		
		for(int i=1;i<=n;++i)
		{
			System.out.print(firstTerm + ", ");
			// compute the next term
			
			int nextTerm = firstTerm+secondterm;
			firstTerm = secondterm;
			secondterm = nextTerm;
			
		}
	}
}
