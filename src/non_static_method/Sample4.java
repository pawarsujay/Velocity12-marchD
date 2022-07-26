package non_static_method;

public class Sample4 {

	public void miss ()
	{
		System.out.println("non static method get called");
	}
	
	public static void main(String args [])
	{
		Sample3 sona = new Sample3 ();
		sona.display();
		
		Sample4 sonu=new Sample4();
		sonu.miss();
		
	}
}
