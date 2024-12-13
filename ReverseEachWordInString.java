package Practice;

import java.util.Scanner;

public class ReverseEachWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String output="";
		String a[]=s.split(" ");
		
		for(String f:a)
		{
			String r="";
			for(int i=f.length()-1;i>=0;--i)
			{
				r=r+f.charAt(i);
			}
			output=output+r+" ";	
		}
		System.out.println(output);
		

	}

}
