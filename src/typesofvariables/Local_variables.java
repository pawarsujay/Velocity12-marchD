package typesofvariables;

public class Local_variables {

	public void m1()
	{
		int v1 = 10 ; //local variable
		System.out.println(v1);
		
	}
	public static void m2()
	{
		Local_variables ss =new Local_variables();
		ss.m1();
		int v1=10;
		System.out.println(v1);
		
	}
	public static void main(String args [])
	{      
		int v1 = 100 ;
	
		Local_variables ss = new Local_variables();
		ss.m1();
		m2();
		System.out.println(v1);
		
	}
}
