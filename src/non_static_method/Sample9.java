package non_static_method;

public class Sample9 { //calling non static method another static method

	public void display()
	{
		System.out.println("Hello");
		
	}
	public static void message()
	{
		 Sample9 don = new Sample9();
		 don.display();
		 
	}
	public static void main(String args [])
	{
		message();
		
	}
}
