package prime;

import java.util.Scanner;

public class stringrevers {
	public static void main(String []args)
	{
	
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the string");
	
	String t=scan.next();
	String ot=t;
	String r="";
	for(int i=0;i<t.length();i++)
	{
		r=t.charAt(i)+r;
	}
	System.out.println("reverse number "+r);
	if(ot.equals(r))
	{
		System.out.println("number is palindrome");
	}
	else
	{
		System.out.println("number is not palindrome");
	}
	}
}
