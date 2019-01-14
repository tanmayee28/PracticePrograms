package String_package;

import java.util.Scanner;

public class StringValueSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String :");
		String str=sc.next();
		int sum1=new StringValueSum().intSum(str);
		System.out.println(sum1);
	}
	
	public int intSum(String str)
	{
	
		String[]ch=str.split("");
		int sum=0;
		for(int i=0;i<ch.length;i++)
		{
			try {
				Integer no=new Integer(ch[i]);
				sum+=no;
			}catch(NumberFormatException e)
			{
				continue;
			}
		}
		return sum ;
		
	}

}
