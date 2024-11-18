package practice;

import java.util.Scanner;

public class PerfectSquer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		checkSquare(num);

	}
	
	public static void checkSquare(int num)
	{
		int sqr=(int) Math.sqrt(num);
		int perfectsqr=sqr*sqr;
		if(perfectsqr==num)
		{
			System.out.println("PerfectSquare "+num);
		}
		else
		{
			System.out.println("Not  a PerfectSquare "+num);
		}
	}

}
