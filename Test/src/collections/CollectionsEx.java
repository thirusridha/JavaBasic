package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.SortedMap;

public class CollectionsEx
{
	public static void main(String[] args) 
	{
		Collection c = new ArrayList();
		c.add("sridhar");
		c.add(123);
		c.remove(1);
		System.out.println(c);
		ArrayList a = new ArrayList(c);
		System.out.println(a);
		LinkedList l = new LinkedList(a);
		System.out.println(l);
		l.addFirst("khadeer");
		System.out.println(l);
		System.out.println(l.get(1));
		HashMap h =new HashMap();
		h.put(2, "aswanth");
		h.put(1, "sridhar");
		System.out.println(h);
		
	}
}
