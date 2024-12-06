package Practice;
import java.util.*;
public class GuessNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Random r=new Random();
		int random=r.nextInt(100)+1;
		int attempt=0;
		boolean guesscorrect=false;
		int guess;
		
		
		while(!guesscorrect)
		{
			System.out.println("enter the guess");
			guess=sc.nextInt();
			attempt++;
			
			if(guess<random)
			{
				System.out.println("your enter number is less thena random");
			}
			else if(guess>random)
			{
				System.out.println("your enter number is higher thena random");
			}
			else
			{
				guesscorrect=true;
				System.out.println("guessed number id correct:"+attempt);
			}
		}
		
		
		

	}

}
