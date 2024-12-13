package Practice;

import java.util.Scanner;

public class Perfect_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==n)
		{
			System.out.println("Perfect number: "+n);
		}
		else
		{
			System.out.println("not Perfect number: "+n);
		}

	}

}
