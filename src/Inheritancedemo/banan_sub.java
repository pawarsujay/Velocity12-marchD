package Inheritancedemo;

public class banan_sub extends fruit_super
{
	public void vitamina()
	{
		System.out.println("Banan has vitamin A");
	}
	public static void main(String[] args) 
	{
		banan_sub b=new banan_sub();
		b.vitamina();
		b.color("Yellow");
		b.taste("sweet");
	}
}

