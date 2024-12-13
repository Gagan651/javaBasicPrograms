package InterviewRumango;

import java.util.Scanner;

public class Factorial_between {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int fact=1;
		for(int j=n1;j<=n2;j++)
		{
		for(int i=1;i<j;i++)
		{
			fact=fact*j;
			break;
		}
		System.out.println(fact);
		}

	}

}
