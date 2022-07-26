package Pooja_mam_Logical_proggramme;

public class reverse_number {

	public static void main(String args[])
	{
		int num=12345;
		int reverseno=0;
		int digit;
		
		while (num!=0)
            {
	           digit = num%10;
	           reverseno= reverseno*10+digit;
	           num/=10;
	         
                }
		  System.out.println(reverseno);
	}
}
