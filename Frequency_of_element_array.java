package Practice;

import java.util.Scanner;

public class Frequency_of_element_array {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int count[]=new int[a.length];
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=sc.nextInt();
		}
		
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
				System.out.println("count of "+a[i]+" is: "+count[i]);
			}
		}
				
		
	}

}
