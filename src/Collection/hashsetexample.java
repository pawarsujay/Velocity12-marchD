package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class hashsetexample {

	public static void main(String args[])
	{
		HashSet s = new HashSet();
		
		s.add("XYZ");
		s.add(300);
		s.add(7.5);
		s.add('g');
		s.add(7.5); // ignore
		s.add(null);
		s.add(null); // ignore
		
		System.out.println(s);
		
		s.remove('g');
		System.out.println(s);
		
		Iterator i=s.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		for(Object o:s)
		{
			System.out.println(o);
		}	

		
	}
}
