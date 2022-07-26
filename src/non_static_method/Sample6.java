package non_static_method;

public class Sample6 {
      // non static with parameters
	public void add(int x , int y, int z)
	{
		System.out.println(x+y+z);
		System.out.println(x*y*z);
		System.out.println(x+y);
	}
	public void multi(int a , int b)
	{
		System.out.println(a*b);
		
	}
	public static void main(String args [])
	{
		Sample6 answer = new Sample6 ();
		answer.add(20, 30, 40);
		answer.multi(35, 25);
	}
}
