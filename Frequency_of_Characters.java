
package Practice;

import java.util.Scanner;

public class Frequency_of_Characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		String s=new String();
		s=sc.nextLine();
		char c[]=s.toCharArray();
		int count[]=new int[c.length];
		for(int i=0;i<=c.length-1;i++)
		{	  count[i]=1;
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]==c[j])
				{
					count[i]++;
					c[j]='0';				}
			}	
		}
		for(int i=0;i<c.length;i++)
		{
			if(c[i]!='0')	{
				System.out.println("count of "+c[i]+" is :"+count[i]);
			}
		}
		
		}

}
