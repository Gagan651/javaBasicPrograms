package Practice;

import java.util.Scanner;

public class FindMissingNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int n=sc.nextInt();
		int a[]=new int[n];
		int sum=(n+1)*(n+2)/2;
		int sum2=0;
		System.out.println("enter the array elements");
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<=a.length-1;i++)
		{
			sum2=sum2+a[i];
		}
		int res=sum-sum2;
		
		System.out.println("array elements:");
		for(int i=0;i<=a.length-1;i++)
		{
		System.out.println(a[i]+" ");
		}
		System.out.println("missing number: "+res);
	}

}
