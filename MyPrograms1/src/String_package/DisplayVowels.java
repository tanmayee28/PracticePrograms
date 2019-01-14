package String_package;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class DisplayVowels {

	 static int cnt=0;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter Your String :");
		String str=sc.next();
		//getVowels(str);
		hmapVowelsCount(str);
	}
	public static void getVowels(String str)
	{
		char charr[]=new char[str.length()];
		int j=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='a' || ch=='e'|| ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E'|| ch=='I' || ch=='O' || ch=='U'   )
			{
				charr[j]=ch;
				System.out.print(" "+ch);
				j++;
				cnt++;
			}
			
		}
		System.out.println("\n "+"Count :"+cnt);
		//System.out.println(Arrays.toString(charr)+" Total count :"+cnt);
	}
	public static void hmapVowelsCount(String str)
	{
		String[]strarr=str.split("");
		
		HashMap<String,Integer>hmap=new HashMap<String,Integer>();
		for(int i=0;i<strarr.length;i++)
		{
			int cnt=1;
			for(int j=i+1;j<strarr.length;j++) 
			{
				if(strarr[i].equals('a') ||strarr[i].equals('e')|| strarr[i].equals('i') || strarr[i].equals('o') || strarr[i].equals('u') || strarr[i].equals('A') || strarr[i].equals('E')|| strarr[i].equals('I') || strarr[i].equals('O') || strarr[i].equals('U')   )
				{
					if(strarr[i].equals(strarr[j]))
					{
						cnt++;
					}
					if(hmap.containsKey(strarr[i]))
					{
						continue;
					}
					hmap.put(strarr[i], cnt);
				}
			}
			System.out.println(hmap);				
		}

	}
	
}
