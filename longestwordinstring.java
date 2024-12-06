package Practice;

import java.util.Scanner;

public class longestwordinstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s1[]=s.split(" ");
		String longest="";
		int max=0;
		for(String c:s1)
		{
			if(c.length()>max)
			{
				max=c.length();
				longest=c;
			}
			
		}
		System.out.println("logest word in "+s+" is "+longest);

	}

}
