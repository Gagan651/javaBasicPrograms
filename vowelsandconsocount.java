package prime;

import java.util.Scanner;

public class vowelsandconsocount {
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the string");
		String s=scan.nextLine();
		String st=s.toLowerCase();
		int counto=0;
		int countc=0;
		for(int i=0;i<st.length();i++)
		if(st.charAt(i)=='a'||st.charAt(i)=='e'||st.charAt(i)=='i'||st.charAt(i)=='o'||st.charAt(i)=='u')
		{
			counto++;
			System.out.println("vowels are ");
			System.out.println(st.charAt(i));
		}
		else
		{
			countc++;
			System.out.println("consonantes are ");
			System.out.println(st.charAt(i));
		}
		System.out.println("vowels count "+counto);
		System.out.println("consonantes count "+countc);
	}
	
	
	

}
