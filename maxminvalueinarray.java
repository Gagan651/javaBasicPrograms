package prime;

import java.util.Scanner;

public class maxminvalueinarray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter the array elements");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int max=a[0];
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
				
			}
		}
		System.out.println(max);
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
				
			}
		}
		System.out.println(min);
		
		
		
	}
	

}
