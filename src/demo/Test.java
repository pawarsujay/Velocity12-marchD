package demo;

public class Test {

	 
	
	 Test(int i) {
	      System.out.println("Hello");	 
	 }
	 Test(Test test) {
	      System.out.println("World");	  
	 }
	public static void main(String[] args) 
	{
	    Test t = new Test(new Test(20));
	 }
	}

