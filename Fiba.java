package prime;

import java.util.Scanner;

public class fiba {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int n1=0,n2=1,n3=0;
		for(int i=0;i<n;i++)
		{
			System.out.println(n1+" ");
			n3=n1+n2;
			n1=n2;
			n2=n3;
			
			
		}
		//System.out.println(n2);
		
	}

}
