package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Sort_a_HashMap_by_Values {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Input:Map: {A=5, B=1, C=3}
//		Output: {B=1, C=3, A=5}
		Scanner sc=new Scanner(System.in);
		HashMap<String,Integer> h=new HashMap<String, Integer>();
		int n=sc.nextInt();
		for(int i=0;i<=n;i++)
		{
			h.put(sc.next(), sc.nextInt());
		}
		
		List<Map.Entry<String, Integer>> list=new ArrayList<Map.Entry<String,Integer>>(h.entrySet());
		System.out.println(list);
		list.sort(Map.Entry.comparingByValue());
		LinkedHashMap<String, Integer> l=new LinkedHashMap<String, Integer>();
		
		for(Map.Entry<String, Integer> entry:list)
		{
			l.put(entry.getKey(),entry.getValue());
		}
		System.out.println(l);

	}

}
