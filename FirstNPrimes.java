package InterviewRumango;

import java.util.Scanner;

public class FirstNPrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		for(int i=2;count<n;i++)
		{
			boolean flag=true;
			if(i<=1)
				continue;
			for(int j=2;j<i;j++)
			{
			if(i%j==0)
			{
				flag=false;
			}
			}
			if(flag==true)
			{
				System.out.println(i);
				count++;
			}
		}

	}

}
