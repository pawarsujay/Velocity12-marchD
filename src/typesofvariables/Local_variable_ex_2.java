package typesofvariables;

public class Local_variable_ex_2 {

	int rollno ;
	int maths ;
	int eng;
	int sci ;
	static String school= "Highschool";
	

         public static void main(String args [])
         {
        	 Local_variable_ex_2 Priya = new Local_variable_ex_2();
        	 Local_variable_ex_2 Rahul = new Local_variable_ex_2 ();
        	 Local_variable_ex_2 Kirti = new Local_variable_ex_2 ();
        	 
        	 school = "college";
     		Priya.rollno=1;
    		Priya.maths=70;
    		Priya.eng=80;
    		Priya.sci=60;
    		
    		Rahul.rollno=2;
    		Rahul.maths=80;
    		Rahul.eng=67;
    		Rahul.sci=75;
    		
    		Kirti.rollno=3;
    		Kirti.maths=60;
    		Kirti.eng=75;
    		Kirti.sci=80;
    		
    		System.out.println("Priya got marks for Mathematics, English, Science : "+Priya.rollno+"  "+Priya.maths+"  "+Priya.eng+"  "+Priya.sci+" "+school);
    		System.out.println("Rahul got marks for Mathematics, English, Science : "+Rahul.rollno+"  "+Rahul.maths+"  "+Rahul.eng+"  "+Rahul.sci+" "+school);
    		System.out.println("Kirti got marks for Mathematics, English, Science : "+Kirti.rollno+"  "+Kirti.maths+"  "+Kirti.eng+"  "+Kirti.sci+" "+school);
    	}
    }
