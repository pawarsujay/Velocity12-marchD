package Logical_Programme;

public class Reverse_Alphabet {

	public static void main(String args[])
	{
		for(int i=5;i>0;i--)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print((char)(j+65));
			}
			System.out.println("");
		}
	}
}
