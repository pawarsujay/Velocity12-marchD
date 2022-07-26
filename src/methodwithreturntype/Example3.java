package methodwithreturntype;

public class Example3 {

	//program to return square and cube of number of integer value
	public int square(int num)
	{
		return num*num; // 3*3 =9
	
	}
	public int cube(int num)
	{
		return num*num*num;  // 9*9*9
	}
	public static void main(String args [])
	{
		Example3 object = new Example3();
		int a= object.square(3);
		int b= object.cube(a);
		System.out.println("Square :"+a +"Cube:"+b);
		
	}
}
