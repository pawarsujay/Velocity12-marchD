package Pooja_mam_Logical_proggramme;

public class Armstrong_Number {

	public static void main(String args[])
	{
		int num=153;
		int digit;
		int originalnum=num;
		int sum=0;
		
		while(num!=0)
		{
			digit= num%10;
			sum+= (digit*digit*digit);
			num/=10;
		}
		if (originalnum==sum)
		{
			System.out.println(originalnum+" This number is Armstrong number");
		}
		else
		{
			System.out.println(originalnum+" This number is not armstrong number");
		}
	}
}
