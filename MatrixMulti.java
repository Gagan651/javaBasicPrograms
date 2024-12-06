package Practice;

import java.util.Scanner;

public class MatrixMulti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the 1 matrix row and col size");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int a[][]=new int[r][c];
		int mul[][]=new int[r][c];
		
		System.out.println("enter the 2 matrix row and col size");
		int r1=sc.nextInt();
		int c1=sc.nextInt();
		int a1[][]=new int[r1][c1];
		
		System.out.println("enter the 1 matrix array elements");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("enter the 2 matrix array elements");
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				a1[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c1;j++)
			{
				mul[i][j]=0;
				for(int k=0;k<c;k++)
				{
					mul[i][j]+=a[i][k]*a1[k][j];
				}
			}
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(mul[i][j]+" ");
			}
			System.out.println();
		}
		
		

	}

}
