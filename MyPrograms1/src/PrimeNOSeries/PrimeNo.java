package PrimeNOSeries;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your no");
		int no=sc.nextInt();
		
		new PrimeNo().getFibo(no);
	}
	public void getFibo(int no)
	{
		int j;
		for(int i=2;i<no;i++)
		{
			for( j=2;j<i;j++)
			{
				if(i%j==0)
					break;
			}
			if(i==j)
				System.out.println(i);
		}
	}
	
	
}
