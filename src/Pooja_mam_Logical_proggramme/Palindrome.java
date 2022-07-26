package Pooja_mam_Logical_proggramme;

public class Palindrome {

	public static void main(String args[])
	{
		int num=12321;
		int reverse=0;
		int digit;
		int originalnum;
		
		originalnum=num;
		
		while(num!=0)
		{
			digit = num%10;
			reverse= reverse*10+digit;
			num/=10;
		}
			if (originalnum==reverse)
			{
				System.out.println(originalnum+"the number is palindrop");
			}
			else
			{
				System.out.println(originalnum+"the number is not palindrop");
			}
		}
	}

