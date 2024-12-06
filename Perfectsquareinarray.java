package prime;

import java.util.Scanner;

public class Perfectsquareinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter the array elemets");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		checkingperfectsquare(a);

	}
	public static boolean perfectsquare(int num)
	{
		int sqr=(int) Math.sqrt(num);
		return sqr*sqr==num;
	}
	
	public static void checkingperfectsquare(int a[])
	{
		for(int b:a)
		{
			if(perfectsquare(b))
			{
				System.out.println(b);
			}
		}
	}

}
