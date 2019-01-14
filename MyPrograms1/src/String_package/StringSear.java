package String_package;

import java.util.Scanner;

public class StringSear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		String inp="";
		String sub="";
		System.out.println("enter a String :");
		inp=sc.next();
		subString(inp);
		
				
	}
	public static void subString(String str)
	{
		int i=1;
		int start=0,end =0;
		String finalstring="";
		while(end<str.length()) {
			
			end=start+i;
			String sub=str.substring(start, end);
			start=end;
			finalstring=finalstring+reverse(sub);
			i++;
		}
		System.out.println("Final String :"+finalstring);
	}
	public static String reverse(String str)
	{
		return new StringBuffer(str).reverse().toString();
	}
}
