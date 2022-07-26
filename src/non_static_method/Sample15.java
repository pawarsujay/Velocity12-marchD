
// Main Method


package non_static_method;

public class Sample15 {

	public  static void main(String args[])
	{
		//step2: object creation
				Sample11 d= new Sample11();
				
				//step3:method call
				d.square(25);
				d.rectangle(20, 30);
				d.circle(10);
				Sample12.show();
				Sample14 d1 = new Sample14();
				d1.message();

		
	}
}
