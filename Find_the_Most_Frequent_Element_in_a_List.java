package practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class Find_the_Most_Frequent_Element_in_a_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Find the Most Frequent Element in a List
//
//Use a HashMap to find the most frequently occurring element in a list.
//Input: [1, 3, 2, 3, 4, 3, 2, 2, 2]
//Output: 2
		
		ArrayList l=new ArrayList();
		TreeMap h=new TreeMap();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(3);
		l.add(1);
		l.add(1);
		l.add(2);
		l.add(2);
		l.add(2);
		
	
		
		for(Object i:l)
		{
		   int j=Collections.frequency(l, i);
			h.put(j,i);
		}
		System.out.println(h);
//		System.out.println(h.size());
//		System.out.println(h);
//		System.out.println("most ocuured :"+(h.get(h.size())));
		Collection s=h.values();
		int last=0;
		for(Object j:s)
		{
			last=(int) j;
		}
		System.out.println("most occured element :"+last);
		

	}

}
