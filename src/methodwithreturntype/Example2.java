package methodwithreturntype;

public class Example2 {

	//method with returntype and with arguments
	
	public int compare(int a, int b) // local variables
	{
		System.out.println("value of a"+a);
		System.out.println("value of b"+b);
		if (a>b) // 10>20
			return a;
		else
			return b; //20
	}
	public static void main(String args[])
	{Example2 pp=new Example2();
	int result=pp.compare(10,20);
	System.out.println("Largest no.is"+result);
	
}
}
