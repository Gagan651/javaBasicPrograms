package prime;

import java.util.Scanner;

public class Findlengthofstringwithoutusingbuiltinfunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char b[]=s.toCharArray();
		int count=0;
		for(char c1:b)
		{
		  count++;	
		}
		System.out.println(count);
	}

}
