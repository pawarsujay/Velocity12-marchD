package non_static_method;

public class Sample10 {

	// calling static method in non static method
	
	public static void display() // Static method
	{
		System.out.println("calling form non static method");

	}
	public void show() // non static method
	{
		display();
		
	}
	public static void main(String args [])
	{
		Sample10 obj = new Sample10();
		obj.show(); // called non static method in main method
		
	}
}
