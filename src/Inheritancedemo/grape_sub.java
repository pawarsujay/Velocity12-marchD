package Inheritancedemo;

public class grape_sub extends fruit_super
{
	public void zinc()
	{
		System.out.println("Grape has zinc");
	}
	public static void main(String[] args) 
	{
		grape_sub g=new grape_sub();
		g.zinc();
		g.color("Green");
		g.taste("Sweet");
	}
}

