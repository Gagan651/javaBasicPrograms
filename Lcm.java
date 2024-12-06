package Practice;

import java.util.Scanner;

public class Lcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int n1=num1;
		int num2=sc.nextInt();
		int n2=num2;
		while(num2!=0)
		{
			int rem=num1%num2;
			num1=num2;
			num2=rem;
		}
		System.out.println("Gcd of "+n1+" and "+n2+" is "+num1);
		
		int mul=n1*n2;
		int Lcm=mul/num1;
		
		System.out.println("LCM of "+n1+" and "+n2+" is "+Lcm);
	}
	}


