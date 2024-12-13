package prime;

import java.util.Scanner;

public class Example17_gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two number");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int res=gcd(num1,num2);
		System.out.println("gcd of two " +num1+" and "+num2+ "is " +res);

	}
	public static int gcd(int num1,int num2)
	{
		while(num1!=0&&num2!=0)
		{
			if(num1>num2)
			{
				num1=num1%num2;
			}
			else
			{
				num2=num2%num1;
			}
		}
		if(num1!=0)
		{
			return num1;
		}
		else
		{
			return num2;
		}
	}

}
