package prime;

import java.util.Scanner;

public class Addingelementstoarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value to insert");
		int value=sc.nextInt();
		System.out.println("enter the size of the array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter the array elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
					
		}
		Insertbegining(a,value);
//		Insertlast(a,value,n);
		System.out.println("after inserting at last");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		

	}

	public static void Insertbegining(int a[],int value)
	{
		for(int i=a.length-1;i>0;i--)
		{
			a[i]=a[i-1];
		}
		a[0]=value;
	}
	
	public static void Insertlast(int a[],int value,int n)
	{
		for(int i=0;i<a.length;i++)
		{
			a[n]=a[n-1];	
		}
		a[n]=value;
	}

}

