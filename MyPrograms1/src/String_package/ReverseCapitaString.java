package String_package;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReverseCapitaString {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your sentence");
		String sentence=br.readLine();
		//System.out.println(sentence);
		reverseCapital(sentence);
	}
	static void reverseCapital(String str)
	{
		String[]s=str.split(" ");
		String result="";
		for(int i=0;i<s.length;i++)
		{
			
			String sm=new StringBuffer(s[i]).reverse().toString();
			String s1=Character.toUpperCase(sm.charAt(0))+sm.substring(1);
			result+=s1+" ";
			 
		}
		System.out.println(result);
	}
}
