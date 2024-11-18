package practice;

import java.util.Scanner;

public class SubStringContainMAinString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String sub=sc.nextLine();
		if(s.contains(sub))
		{
			System.out.println("SubString There in Main String"+sub);
		}
		else
		{
			System.out.println("SubString Not There in Main String"+sub);
		}
	}

}
