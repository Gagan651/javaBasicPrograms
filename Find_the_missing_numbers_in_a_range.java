package Collection;

import java.util.HashSet;
import java.util.Scanner;

public class Find_the_missing_numbers_in_a_range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Find the missing numbers in a range using a HashSet.
//
//		Input:Array: [1, 2, 4, 6], Range: 1 to 6
//		Output: [3, 5]
		Scanner sc=new Scanner(System.in);
		HashSet s=new HashSet();
		HashSet s1=new HashSet();
		int n=sc.nextInt();
		int start=sc.nextInt();
		int end=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			s.add(sc.nextInt());
		}
		
		for(int i=start;i<=end;i++)
		{
			if(!s.contains(i))
			{
				s1.add(i);
			}
		}
		System.out.println("missing number: "+s1);

	}

}
