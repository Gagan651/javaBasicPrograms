package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class Intersection_of_Two_Sets {
	public static void main(String[] args) {
		HashSet h=new HashSet();
		HashSet f=new HashSet();
		
		ArrayList l=new ArrayList();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(3);
		
		
		f.add(2);
		f.add(1);
		h.retainAll(f);
		System.out.println(h);
		
		
		
		
		//frequency count
		HashMap h1=new HashMap();
		for(Object i:l)
		{
			int j=Collections.frequency(l, i);
			h1.put(i, j);
		}
		System.out.println(h1);
		
	}

}
