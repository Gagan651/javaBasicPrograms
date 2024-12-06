package prime;

import java.util.Scanner;

public class Removevowelsfromestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String st=s.toLowerCase();
		StringBuilder sb=new StringBuilder();
		
		for(int i=0;i<st.length();i++)
		{ 
		if(st.charAt(i)!='a'&&st.charAt(i)!='e'&&st.charAt(i)!='i'&&st.charAt(i)!='o'&&st.charAt(i)!='u')
		{
			sb.append(st.charAt(i));
		}
		
		}
		System.out.println(sb.toString());
	}

}
