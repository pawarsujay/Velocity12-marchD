package typesofvariables;

public class Static_vairable_Example1 {

	
	static int s;  // static variable
	
	public void display()
	{
		// used static variable into non static method
		System.out.println(s); // 40
		s++ ; // 41    1
	}
	public static void M1()
	{
		//used static variable in static method
		System.out.println(s);//41
	}
	public static void main(String args[])
	{
		System.out.println(s); // 40
		Static_vairable_Example1 e = new Static_vairable_Example1();
		e.display();
		M1();
		System.out.println(Static_vairable_Example2.d); // dusrya class madhun jevha static variable call kartat
		//tevha tyacha syntax class name.variable name
		
	}
}
