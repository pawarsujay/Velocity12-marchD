package Array;

public class Example2 {

	public static void main(String args [])
	{
	// array declaration 
	
		String []str=new String [3];
		// array initialization 
		
		str[0]="suresh";
		str[1]="priyanka";
		str[2]="sujay";
	
		//array usage 
		// using for loop
		for (int i=0;i<=2;i++)
		{
			System.out.println(str[i]+" "); // suresh priyanka sujay
		}
		System.out.println();
		
		// using for each loop
		for (String j : str)
		{
			System.out.println(j);
			
		}
		
}
}
