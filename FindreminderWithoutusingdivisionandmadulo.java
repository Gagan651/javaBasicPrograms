package prime;

import java.util.Scanner;

public class FindreminderWithoutusingdivisionandmadulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter dividend");
		int dividend=sc.nextInt();
		System.out.println("enter divisor");
		int divisor=sc.nextInt();
		int rem=remindercheck(dividend,divisor);
		System.out.println("reminder "+rem);
	}
	
	public static int remindercheck(int dividend,int divisor)
	{
		if(divisor==0)
		{
			System.out.println("we cant not divide by zero");
		}
		boolean isnegative=false;
		if(divisor<0)
		{
			divisor=-divisor;
			isnegative=!isnegative;
		}
		if(dividend<0)
		{
			dividend=-dividend;
			isnegative=!isnegative;
		}
		while(dividend>=divisor)
		{
			dividend-=divisor;
		}
		return isnegative?-dividend:dividend;
	}

}
