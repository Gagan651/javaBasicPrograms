package prime;

public class demo {
	public static void main(String[] args) {
		int a=123;
		int rem=0;
		
		StringBuilder st=new StringBuilder();
		while(a!=0)
		{
			rem=a%10;
			st.append(rem);
			a=a/10;
		}
		System.out.println(st);
		String f=st.toString();
		char c[]=f.toCharArray();
		System.out.println(c);
		char min=c[0];
		//System.out.println(min);
		for(int i=0;i<c.length;i++)
		{
			if(min>c[i])
			{
				min=c[i];
				
			}
					
		}
		System.out.println(min);
		
		
	}

}
