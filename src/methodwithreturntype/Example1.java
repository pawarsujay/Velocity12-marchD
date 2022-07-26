package methodwithreturntype;

public class Example1 {

	// method with return type
		// create method that should return integer value
		

	public int m1()
	{
		return 20;
	}
	public static void main(String args[])
	{
		Example1 ss=new Example1();
		int a=ss.m1();//20
        System.out.println(a);//20
		
		System.out.println(ss.m1());//20

	}
}
