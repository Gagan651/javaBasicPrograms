package prime;

import java.util.Scanner;

public class factroialnumberbetween {
	public static void main(String[]args)
	{
		int fact=1,n1,n2;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		n1=scan.nextInt();
		n2=scan.nextInt();
		for(int i=n1;i<=n2;i++)
			{  
				for(int j=1;j<i;j++)
				{
				 fact=fact*i;
				 break;
				 
				 
				 
				}
				System.out.println(fact);
	}

}
}
