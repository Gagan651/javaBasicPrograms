package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Finding_elements_appearing_more_than_nby3_times {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		ArrayList l=new ArrayList();
		TreeMap<Integer, Integer> t=new TreeMap<Integer, Integer>();
		int n=sc.nextInt();
		int threshold=n/3;
		int a[]=new int[n];
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int c:a)
		{
			l.add(c);
		}
		
		for(Object o:l)
		{
			int f=Collections.frequency(l, o);
			t.put((Integer) o, f);
		}
		System.out.println(t);
		
		for(Map.Entry<Integer, Integer> entry:t.entrySet())
		{
			//System.out.println(entry.getValue());
			if(entry.getValue()>threshold)
			{
				System.out.println(entry.getKey());
			}
		}

	}

}
