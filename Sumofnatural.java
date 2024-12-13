package prime;
import java.util.Scanner;
public class Sumofnatural {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int sum=0,n1,n2;
			System.out.println("enter numbers");
			n1=sc.nextInt();
			n2=sc.nextInt();
			for(int i=n1;i<=n2;i++)
			{  
				
				sum=sum+i;
				System.out.println(sum);
			}
			
			}

	}

