package prime;

import java.util.Scanner;

public class Reverse_array_using_two_pointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int a1[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		int j=a.length-1;
		for(int i=0;i<a.length;i++)
		{
			a1[j]=a[i];
			j--;
		}
		
		System.out.println("reverse array: ");
		System.out.print("[");
		for(int i=0;i<a1.length-1;i++)
		{
			System.out.print(a1[i]+",");
		}
		System.out.print(a1[a1.length-1]+"]");
	}

}
