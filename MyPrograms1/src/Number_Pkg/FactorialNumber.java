package Number_Pkg;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no :");
		int no=sc.nextInt();
		fact(no);
		duplicate();
	}
	static void  fact(int no)
	{
		int i=1;
		int temp=1;
		while(i<=no)
		{
			temp=temp*i;
			i++;
		}
		System.out.println("Factorial :"+temp);
	}
	static void duplicate()
	{
		int []arr= {10,5,24,89,21,4,5,29};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[i]);
				}
				
			}
		}
	}
	

}
 