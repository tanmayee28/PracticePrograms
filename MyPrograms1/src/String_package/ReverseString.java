package String_package;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your string :");
		String orgl=sc.next();
		getReverseString(orgl);
	}
	public static void getReverseString(String str)
	{
		char ch[]=str.toCharArray();
		String string="";
		for(int i=ch.length-1;i>=0;i--)
		{
			string+=ch[i];
		}
		System.out.println("Reverse String :"+string);
		
	}
	
	
}
