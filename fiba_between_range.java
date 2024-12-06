package InterviewRumango;

import java.util.Scanner;

public class fiba_between_range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	
		int start=sc.nextInt();
		int end=sc.nextInt();
		int n1=0,n2=1;
		 while(n1<=end)
		{
			 if(n1>=start)
			 {
			System.out.println(n1+" ");
			 }
			int n3=n1+n2;
			n1=n2;
			n2=n3;
		}


	}

}
