package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Count_Occurrences_of_Each_Character_in_a_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char k[]=s.toCharArray();
		ArrayList a=new ArrayList();
		
		HashMap h=new HashMap();
		for(char c:k)
		{
			a.add(c);
		}
		for(char i:k)
		{
			int j=Collections.frequency(a, i);
			h.put(i, j);
		}
		System.out.println(h);
	}

}
