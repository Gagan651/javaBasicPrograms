package practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
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
		TreeMap<Integer,Integer> h=new TreeMap<Integer,Integer> ();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(3);
		l.add(1);
		l.add(1);
		l.add(1);
		l.add(1);
		l.add(2);
		l.add(2);
		l.add(2);
		l.add(2);
		
		System.out.println(l);
	
		int maxfreuency=0;
		for(Object i:l)
		{
		   int j=Collections.frequency(l, i);
		   h.put((Integer) i,j);  
		}
		System.out.println(h);
		for(Map.Entry<Integer,Integer> entry:h.entrySet())
		{
			if(maxfreuency<entry.getValue())
			{
				maxfreuency=entry.getValue();
			}
		}
		System.out.println(maxfreuency);
		for(Map.Entry<Integer,Integer> entry:h.entrySet())
		{
			if(maxfreuency==entry.getValue())
			{
				System.out.println("most frequent :"+entry.getKey());
			}
		}

	}

}
