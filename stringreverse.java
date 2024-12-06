package prime;

import java.util.Scanner;

public class stringreverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		String r="";
		String ou="";
		for(int i=0;i<s.length();i++)
		{
			r=s.charAt(i)+r;	
		}
		System.out.println(r);
		//ou=r+ou+"";
		//System.out.println(ou);
		
		
	}

}
