package non_static_method;

public class Sample8 
{
	//Calling non static method in another non static method
	public void m1(String s)//non static method
	{
		System.out.println(s);
	}
              public void show()
              {
            	  m1 ("Good morning , another non static method calling");
              }
              public static void main(String a[])
              {
            	  Sample8 correct = new Sample8();
            	  correct.show();
            	  correct.m1("Welcome");
            	  
            	  
	}
}
