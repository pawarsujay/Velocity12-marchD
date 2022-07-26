package Strings;

public class Split {

	public static void main(String args[])
	{
		String s6 = "Sachin, Suresh, Priya, Riya, Suresh";
		
		String [] s = s6.split(" ");
		
		for(String T:s)
		{
			System.out.println("\n"+T);
		}
		String [] s2= s6.split("r");
		  
			for(String s4:s2)
			{
				System.out.println("\n"+s4);
			}

	}
}
