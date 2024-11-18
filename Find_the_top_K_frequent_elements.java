package practice;

import java.util.Scanner;

public class Find_the_top_K_frequent_elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int a[]=new int[n];
		int r[]=new int[a.length];
		int counter=0;
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=sc.nextInt();
		}
		int count[]=new int[a.length];
		for(int i=0;i<=a.length-1;i++)
		{    count[i]=1;
			for(int j=i+1;j<=a.length-1;j++)
			{
				if(a[i]==a[j])
				{
					count[i]++;
					a[j]='0';
					
				}
				
			}
		}
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]!='0')
			{
				System.out.println(a[i]+"--->"+count[i]);
				if(count[i]>1)
				{
					r[counter]=a[i];
					counter++;
				}
			}
		}
		
		for(int i=0;i<k;i++)
		{
			System.out.println(r[i]);
		}

	}

}
