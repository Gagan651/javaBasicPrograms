package prime;

import java.util.Arrays;
import java.util.Scanner;

public class Findthemdianofthegivenarrayinjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n=sc.nextInt();
		int a[]=new int[n];
		
		System.out.println("enter the array elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
					
		}
		Arrays.sort(a);
		if(n%2!=0)
		{
			int mid=(n/2);
			System.out.println(a[mid]);
		}
		else
		{   int mid=(n/2);
			double md=(a[mid]+a[mid-1])/2;
			System.out.println(md);
		}
		
		

	}

}
