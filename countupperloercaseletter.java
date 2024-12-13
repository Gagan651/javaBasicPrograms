package prime;

import java.util.Scanner;

public class countupperloercaseletter {
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the string");
		String a=scan.next();
		int upper=0,lower=0;
		for(int i=0;i<a.length();i++)
		{   char ch=a.charAt(i);
			if(ch>='A'&&ch<='Z')
			{
				   upper++;
			}
		    else 
		    {
			       lower++;
		    }
		}
		System.out.println("upper case letter count "+upper);
		System.out.println("lower case letter count "+lower);
	}

}
