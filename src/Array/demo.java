package Array;

public class demo {

	
		//methods to print information about exception 
		public static void main(String[] args) throws InterruptedException 
		{
			System.out.println("Login in application");
			String s="Good morning";
			int [] a= {10,2,3,5,6};
			int l=s.length();
			try
			{
				
				System.out.println(s.charAt(l));//risky code
				a[8]=78;
			}
			catch(StringIndexOutOfBoundsException e)
			{
				System.out.println(e.getMessage());//gives description of exception
				Thread.sleep(3000);
				e.printStackTrace();
				Thread.sleep(3000);
				System.out.println(e);
			}
			catch(ArrayIndexOutOfBoundsException ae)
			{
				ae.printStackTrace();
			}
			finally
			{
				System.out.println("logout from application");
			}
		
	}

}
