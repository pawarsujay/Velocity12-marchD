package Collection;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RemveDuplicateElementsfromarray {

	
	public static void main(String args [])
	{
		int [] num= {30,89,78,30,45,20,78,20,56};
		
		ArrayList <Integer> a =new ArrayList <Integer>();
		
		for (int i=0; i<num.length;i++)
		{
			a.add(num[i]);
		}
		
		System.out.println(a);
		
		LinkedHashSet<Integer> LHS = new LinkedHashSet<>(a);
		
		System.out.println(LHS);
	}
}
