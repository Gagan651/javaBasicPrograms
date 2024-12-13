package Practice;

import java.util.Scanner;

public class Each_word_reverse {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String a1[]=s.split(" ");
		String output="";
		
		for(String x:a1)
		{
			String rev="";
			for(int i=x.length()-1;i>=0;--i)
			{
			    rev=rev+x.charAt(i);	
			}
			output=output+rev+" ";
		}
		System.out.println(output);
		
		
		
		
		
	}

}
