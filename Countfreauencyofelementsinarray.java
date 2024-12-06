package prime;

import java.util.Arrays;
import java.util.Scanner;

public class Countfreauencyofelementsinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter the array elements");
		
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		countaccurance(a);
//		System.out.println("sorted array");
//		for(int i=0;i<a.length;i++)
//		{
//		System.out.println(a[i]);
//		}

	}
	public static void countaccurance(int a[])
	{
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{ 	int count=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				count++;
				else
					break;
				
			}
			System.out.println(a[i]+" occurance "+count);
			i+=(count-1);
			
		}
		
	}

}
