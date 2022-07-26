package constructor;

public class Example6 {

//	Example for mulitple constructor
	int lenth;
	int breath;
	
	//first constructor without parameters.
	Example6()
	{
		System.out.println("calculating area of Rectangle");
	}
	// second parameterised constructor
	Example6(int a, int b)
	{ lenth=a;
	breath = b;
	
	}
	public void area()
	{
		int area = (lenth*breath);
		System.out.println("Area Of Reactangle"+area);
	}
	public static void main(String arhgs[])
	{
		Example6 key=new Example6();
		Example6 power=new Example6(10,20);
		power.area();
	}
}
