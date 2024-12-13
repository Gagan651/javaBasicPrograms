package prime;

import java.util.Scanner;

public class Rotatingarrayleft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[]= {1,2,3,4,5};
		System.out.println("before rotating");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		rotate(a,3);
		System.out.println("after rotating");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}
	public static void reverese(int a[],int start,int end)
	{
		while(start<end)
		{
			int temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			start++;
			end--;
		}
	}
	
	public static void rotate(int a[],int k)
	{
		k=k%a.length;
		if(k<0)
		{
			k=k+a.length;
		}
		reverese(a,0,k-1);
		reverese(a,k,a.length-1);
		reverese(a,0,a.length-1);
	}

}
