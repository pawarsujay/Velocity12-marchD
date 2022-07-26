package non_static_method;

public class Sample11 {

	//Step1: we created non static method
	//create non static method for square
	public void square(int a)
	{
		System.out.println("Area of square= "+(a*a));
	}
	//create non static method for rectangle
	public void rectangle(int l, int b)
	{
		System.out.println("Area of rectangle= "+(l*b));
	}
	//create non static method for circle
	public void circle(int r)
	{
		System.out.println("Area of circle= "+(3.14*r*r));
	}	
}

