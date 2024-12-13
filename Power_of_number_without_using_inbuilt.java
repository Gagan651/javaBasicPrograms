package Practice;

import java.util.Scanner;

public class Power_of_number_without_using_inbuilt {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int pow=sc.nextInt();
	    int rev=1;
	    for(int i=1;i<=pow;i++)
	    {
	    	rev=rev*n;
	    }
	    System.out.println(rev);
}
}
