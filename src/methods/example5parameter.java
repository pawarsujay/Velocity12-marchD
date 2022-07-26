package methods;

public class example5parameter {

	public static void add (int a,int b)
	{
		System.out.println(a+b);
	}
	public static void info(String name,int roll ,float per)
	{
		System.out.println(name+ "    "+roll+"   "+per);
	}
	
	public static void main(String args [])
	{
		add(10,30);
		info("Priya",2,99.99f);
		
	}
}
