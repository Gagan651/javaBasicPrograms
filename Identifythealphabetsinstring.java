package prime;

import java.util.Scanner;

public class Identifythealphabetsinstring {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	String a=sc.nextLine();
	int count=0;
	
	for(int i=0;i<a.length();i++)
	{
		if(a.charAt(i)>=65&&a.charAt(i)<=90||a.charAt(i)>=97&&a.charAt(i)<=122)
		{
			System.out.println(a.charAt(i));
			count++;
		}
		
	}
	System.out.println(count);
}
}
