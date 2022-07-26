package demo;

public class Prime_Number {

	public static void main(String[] args) {
		
		int num = 18;
		int count = 1;
		
		// divide number with all numbers from 2
		for ( int i = 2;i<=num;i++)
		{
			if ( num%i==0)
			{
				count=count+1;
			}
		}
		if (count ==0)
		{
			System.out.println("Number is Prime");
		}
		else
		{
			System.out.println("Number is not Prime");
		}

	}

}
