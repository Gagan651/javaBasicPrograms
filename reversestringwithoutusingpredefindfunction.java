package prime;

import java.util.Scanner;

public class reversestringwithoutusingpredefindfunction {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	String[] f=s.split(" ");
	
	String output="";
	for(String h:f)
	{   String r= "";
	  	for(int i=h.length()-1;i>=0;i--)
	  	{
	  		r=r+h.charAt(i);
	  	}
	  	output=output+r+" ";
	}
	
	System.out.println(output);
}
}
