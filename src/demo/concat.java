package demo;

public class concat {

	
	public static void main(String[] args) 
	{
int i=25466;
int result;
int sum=0;
while(i!=0)
{
	result=i%10;
	if(result%2==0)
	{
		sum+=result;
		System.out.println("it is even no sum="+sum);
	}
	else
	{
		sum+=result;
		System.out.println("it is odd no sum="+sum);
	}
}

	}
}
