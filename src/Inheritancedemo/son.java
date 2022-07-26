package Inheritancedemo;

public class son extends Father
{

	public void car()
	{
		System.out.println("KIA SELTOS");
	}
	public static void main(String args [])
	{
		son ss=new son();
		ss.car();
		ss.home();
		ss.money();
	}
}
