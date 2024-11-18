package practice;

import java.util.HashMap;
import java.util.Map;

public class Finding_all_pairs_with_a_given_sum_in_an_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6};
		int sum=8;
		HashMap<Integer,Integer> h=new HashMap();
		
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=i+1;j<=a.length-1;j++)
			{
				if(a[i]+a[j]==sum)
				{
					h.put(a[i], a[j]);
				}
			}
		}
		
		for(Map.Entry<Integer, Integer> entry:h.entrySet())
		{
			System.out.println("("+entry.getKey()+","+entry.getValue()+")");
		}
		
		
	}

}
