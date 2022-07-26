package non_static_method;

public class Sample1 {  

	public void abhi()  // non static method
	{
		System.out.println( "Abhi Purnale is the best body Builder in Ahmednagar");
	}
	public static void main(String args [])  // static 
	{
		
		// object creation  = class name object name = new class name 
	Sample1 sony = new Sample1();
	
	// call method = objectname.methodname();
	sony.abhi();
	
		
		
		
	}
}
