package prime;

import java.util.Scanner;

public class Removespacefromstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char c[]=s.toCharArray();
		String res="";
		StringBuilder b=new StringBuilder();
		for(char v:c)
		{
			if(v!=' ')
			{
				 res=res+v;
				 b.append(v);
			}
		}
		System.out.println(res.toString());
		System.out.println(b.toString());
	}

}
