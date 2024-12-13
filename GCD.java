package prime;

import java.util.Scanner;

public class Gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the a and b value");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int res=gcd(a,b);
		System.out.println("gcd of "+a+" and "+b+" is "+res);
	}
	public static int gcd(int a,int b)
	{
		while(a!=0&&b!=0)
		{
			if(a>b)
			{
				a=a%b;
			}
			else
			{
				b=b%a;
			}
		}
		if(a!=0)
		{
			return a;
		}
		else
		{
			return b;
		}
	}

}
