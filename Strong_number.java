package Practice;

import java.util.Scanner;

public class Strong_number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		int sum=0;
		while(n!=0)
		{
			int rem=n%10;
			System.out.println(rem);
			sum=sum+fact(rem);
			n=n/10;
			
		}
		if(sum==temp)
		{
			System.out.println("strong number");
		}
		else
		{
			System.out.println("not a strong number");
		}
		
}
	
	public static int fact(int n)
	{	int sum=0;
		int fac=1;
		for(int i=1;i<=n;i++)
		{
			fac=fac*i;
			
		}
		return fac;
		
	}
}
