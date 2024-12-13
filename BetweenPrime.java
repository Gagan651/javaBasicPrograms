package prime;

import java.util.Scanner;

public class betweenprime {
	public static void main(String []args)
	{
		int n1,n2;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the numbers");
		n1=scan.nextInt();
		n2=scan.nextInt();
		for(int i=n1;i<=n2;i++)
			{   int count=0;
			if(i==0||i==1)
				continue;
				for(int j=2;j<i;j++)
				{
					if(i%j==0)
					{
						count=1;
					    break;
					}
				}
				if(count==0)
				{
					System.out.println("prime"+i);
				}
			}
			
		}
		
	}


