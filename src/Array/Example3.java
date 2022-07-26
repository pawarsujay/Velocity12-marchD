package Array;

public class Example3 
{
	//Combine Array Initialization with Array declaration
	public static void main(String[] args) 
	{
		//Method1: Using new keyword
							// 0  1	 2  3  4  5
		int [] arr= new int[] {10,20,30,80,60,40}; //6
		
		//Method2: Using literals []
		
		String [] str= {"Neha","Suresh","Priya","Riya"};
		
		for(int i: arr)
		{
			System.out.println(i);
		}
		
		for(String j: str)
		{
			System.out.println(j);
		}
	}
}
