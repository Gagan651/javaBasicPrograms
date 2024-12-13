package prime;

import java.util.Scanner;

public class upperlowernumberspecial {
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the string");
		String a=scan.nextLine();
		int upper=0,lower=0,number=0,special=0,space=0;
		for(int i=0;i<a.length();i++)
		{   
			if(a.charAt(i)>=65&&a.charAt(i)<=90)
			{
				   upper++;
			}
		    if(a.charAt(i)>=97&&a.charAt(i)<=122)
		    {
			       lower++;
		    }
		    if(a.charAt(i)>=48&&a.charAt(i)<=57)
		    {
		    	number++;
		    }
		    if(a.charAt(i)==32)
		    {
		    	space++;
		    }
		   
		}
		System.out.println("upper case letter count "+upper);
		System.out.println("lower case letter count "+lower);
		System.out.println("number count "+number);
		System.out.println("space count "+space);
		System.out.println(" special letter count "+(a.length()-(upper+lower+space+number)));
	}

}
