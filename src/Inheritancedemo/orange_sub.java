package Inheritancedemo;

public class orange_sub extends fruit_super
{
	public void vitaminC()
	{
		System.out.println("Orange contains vitamin c");
	}
	public static void main(String[] args) 
	{
		orange_sub o= new orange_sub();
		o.vitaminC();
		o.color("orange");
		o.taste("tangy");
	}
}
