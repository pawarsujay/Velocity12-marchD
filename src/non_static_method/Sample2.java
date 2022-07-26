package non_static_method;

public class Sample2 {

	
	// method declaration 
	public void Dada()
	{
		System.out.println("non static methid get called");
		
	}
	public static void main(String args[])
	{
		// object creation 
		Sample2 obj  = new Sample2 ();
		
		// object call method
		obj.Dada();
		
		
				
				
	}
	
}
