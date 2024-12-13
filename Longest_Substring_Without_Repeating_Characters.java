package Practice;

import java.util.Scanner;
import java.util.TreeSet;

public class Longest_Substring_Without_Repeating_Characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner sc = new Scanner(System.in);
		        // TODO: Ask user for input string
		        StringBuilder b=new StringBuilder();
		        String s=sc.nextLine();
		        char c[]=s.toCharArray();
		        TreeSet<Character> t=new TreeSet();
		        for(char c1:c)
		        {
		            t.add(c1);
		        }
		        for(char g:t)
		        {
		        b.append(g);
		        }                                          
		        System.out.println("The length of the longest substring without repeating characters is: "+b.toString().length());

	}

}
