package InterviewRumango;

import java.util.Scanner;

public class Fibo_of_nth_term {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int n1=0,n2=1,n3=0;
		for(int i=2;i<=n;i++)
		{
			
			n3=n1+n2;
			n1=n2;
			n2=n3;
		}
		System.out.println(n2);


	}

}
