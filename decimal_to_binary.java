package Practice;

import java.util.Scanner;

public class decimal_to_binary {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int binary[]=new int[1000];
		int count=0;
		int rem=0;
		while(n!=0)
		{
			rem=n%2;
			binary[count]=rem;
			count++;
			n=n/2;
			
			
		}
		for(int i=count-1;i>=0;i--)
		{
			System.out.print(binary[i]+" ");
		}
	}

}
