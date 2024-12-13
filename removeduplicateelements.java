package prime;

import java.util.Scanner;

public class removeduplicateelements {
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the String");
		String s=scan.nextLine();
		char c[]=s.toCharArray();
		StringBuilder s1=new StringBuilder();
		for(int i=0;i<c.length;i++)
		{   boolean flag=false;
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]==c[j])
				{
					flag=true;
					break;
				}
			
			}
			if(!flag)
			{
			s1.append(c[i]);
			}
			
		}
		System.out.println(s1);
	}

}
