package prime;

import java.util.Scanner;

public class prime {
	public static void main(String []args)
	{
		Scanner scan=new Scanner(System.in);
		boolean flag=true;
		System.out.println("enter the number");
		int a=scan.nextInt();
		
		
		if(a<=1)
		{
			flag=false;
		}
		else
		{
			for(int i=2;i<a;i++)
			{   
				if(a%i==0)
					flag=false;

				
		}
		
		

	}
		if(flag==true)
		{
			
			System.out.println("prime"+a);
			
		}
		else
		{
			System.out.println("not prime "+a);
		}
	}
}
	


