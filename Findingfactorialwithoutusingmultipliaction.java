package prime;

import java.util.Scanner;

public class Findingfactorialwithoutusingmultipliaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number to start");
		int start=sc.nextInt();
		int fact=1;
		for(int i=start;i>=1;i--)
		{
			fact=(int)(fact/(1.0/i));
		}
		System.out.println("factorial number "+fact);
	}

}
