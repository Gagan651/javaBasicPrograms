package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Find_The_First_Non_Repting_char_in_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Given a string, find the first character that does not repeat.
//
//		Input: "swiss"
//		Output: w
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char c[]=s.toCharArray();
		ArrayList a=new ArrayList();
		LinkedHashMap<Character, Integer> l=new LinkedHashMap<Character, Integer>();
		for(char s1:c)
		{
			a.add(s1);
		}
		System.out.println(a);
		for(Object o:a)
		{
			int i=Collections.frequency(a, o);
			l.put((Character) o, i);
		}
		
		for(Map.Entry<Character, Integer> entry:l.entrySet())
		{
			if(entry.getValue()==1)
			{
				System.out.println("First Non Repeting char :"+entry.getKey());
				break;
			}
		}
		
	}

}
