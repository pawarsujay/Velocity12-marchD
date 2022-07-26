package Logical_Programme;

public class Count3 {

	public static void main(String[]arrgs)
	{
	 String str="mumbai is capital of mahrashtra state.also mumbai is economic capital of india ";;
	 int count;
	 // convert the string into lower caase 
	 
	
	 //split the string into words using built 
	 String  words[]=str.split(" ");
	 
	 System.out.println("duplicate words in given string : ");
	 for (int i=0;i<words.length;i++)
	 { count=1;
	 for (int j=i+1;j<words.length;j++)
	 {
		 if(words[i].equals(words[j]))
		 {
			 count++;
			 words[j]="0";
		 }
	 }
	 //Displays the duplicate word if count is greater than 1  
     if(count > 1 && words[i] != "0")  
         System.out.println(words[i]+ "== " + count); 
	 }
}

}
