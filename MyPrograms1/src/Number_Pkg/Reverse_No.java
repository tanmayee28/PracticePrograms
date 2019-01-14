package Number_Pkg;

import java.util.Scanner;

public class Reverse_No {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no to be reversed..:");
		int no=sc.nextInt();
		getReverseNo(no);
	}
	public static void getReverseNo(int a)
	{
		int temp=a,sum=0;
			while(temp>0)
			{
				sum=(sum*10)+(temp%10);
				temp=temp/10;
			}
			System.out.println("Reverse :"+sum);
	}
		
	
}
