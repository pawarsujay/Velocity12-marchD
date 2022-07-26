package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Arraylistexample {

	public static void main(String args[])
	{
		
		// create object an ArrayList
		ArrayList a = new ArrayList();
		
		//insert element in ArrayList
		a.add(200);      // index 0
		a.add("HELLO");  // index 1
		a.add(7.5);      // index 2
		a.add(null);     // index 3
		a.add(200);      // index 4
		
		System.out.println(a);
		
		//want to add element in index2
		
		a.add(2,"PRIYA");
		System.out.println(a);
		
		ArrayList a1 = new ArrayList();
		
		a1.add(40);
		a1.add(5.6);
		a1.add("NEHA");
		
		a.addAll(a1);
		System.out.println(a);
		
		a.addAll(4,a1);
		System.out.println(a);
		
		// Delete Element
		a.remove(7.5);
		System.out.println(a);
		
		// replace value element
		a.set(3, 400);
		System.out.println(a);
		
		System.out.println(a.size());
		
		// fetch element in ArrayList in using for Loop
		for (int i=0;i<(a.size()-1);i++)
		{
			System.out.println(a.get(i));
		
		}
		
		System.out.println("-------------------------------------------");
		
		// using foreach loop
		
		for(Object o:a)
		{
			System.out.println(o);
		}
		
		// using iterator cursor
		Iterator s=a.iterator();
		while (s.hasNext())
		{
			System.out.println(s.next());
		
		}
		
		//using ListIterator cursor
				System.out.println("-------------------------------------------");
				ListIterator l=a.listIterator();
				while(l.hasNext())
				{
					System.out.println(l.next());
				}
				
				while(l.hasPrevious())
			{
					System.out.println(l.previous());
				}
				
				//check particular element is present in list or not=search
				boolean result=a.contains(5.6);
				System.out.println(result);

				//Create Arraylist of generic type=Homogeneous
				
				ArrayList <Integer> al1= new <Integer>ArrayList();
				al1.add(200);
				al1.add(300);	

				
				


				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
	}
}
