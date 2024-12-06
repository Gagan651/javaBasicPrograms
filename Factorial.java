package prime;

import java.util.Scanner;

public class factorial {
	public static void main(String []args)
	{
		Scanner scan=new Scanner(System.in);
		int n,fact=1;
		System.out.println("enter the number");
		n=scan.nextInt();
		for(int i=1;i<=n;i++)
			{
				
				fact=fact*i;
				
			}
		System.out.println(fact);
		}
		
	}


