package typesofvariables;

public class Non_static_variable {

	int e = 10; //non static variable
	
	public static void m1()
	{
		// used non static variable in to static method
		Non_static_variable obj=new Non_static_variable ();
		obj.e=20;
		System.out.println(obj.e );   // objectname.variablename 20
	}
	public void m2()
	{
		// used non static variable into non static method 
		System.out.println(e);
	}
	public void m3()
	{
		
	}
	public static void main(String args [])
	{
		m1();
		Non_static_variable obj1=new Non_static_variable ();
		obj1.m2();
		obj1.m3();
		obj1.e=30;
		System.out.println(obj1.e);
		
		
	}
}
