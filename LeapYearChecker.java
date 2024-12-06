package Practice;

import java.util.Scanner;

public class LeapYearChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		boolean flag=true;
		if(year%4==0)
		{
			if(year%100==0)
			{
				if(year%400==0)
				{
					flag=true;
				}
				else
				{
					flag=false;
				}
			}
			else
			{
				flag=true;
			}
		}
		else
		{
			flag=false;
		}
		if(flag==true)
		{
			System.out.println("year is leap: "+year);
		}
		else
		{
			System.out.println("year is not leap: "+year);
		}

	}
	

}
