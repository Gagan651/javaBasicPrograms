package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class Group_Words_by_Starting_Letter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Group Words by Starting Letter
//		Group words by their starting letter using a TreeMap.
//
//		Input: ["apple", "banana", "apricot", "blueberry"]
//		Output: {a=[apple, apricot], b=[banana, blueberry]}
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		TreeMap<Character,List<String>> t=new TreeMap<Character, List<String>>();
		String s[]=new String[n];
		for(int i=0;i<=s.length-1;i++)
		{
			s[i]=sc.nextLine();
		}
		
		for(String x:s)
		{
			char first=x.charAt(0);
			t.putIfAbsent(first, new ArrayList<>());
			t.get(first).add(x);
		}
		System.out.println(t);

	}

}
