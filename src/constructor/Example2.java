package constructor;

public class Example2 {

	
	int num1;
	int num2;
	// user defined constructor without parameters 
	Example2()
	{
		num1=20;
	    num2=30;
	}
	public void add()
	{
		System.out.println(num1+num2);
	}
	public static void main(String args[])
	{
		Example2 okk=new Example2();
		okk.add();
		
		Example3 obj=new Example3();
		obj.mult();
		obj.div();
		obj.sub();
		
		
	}
}
