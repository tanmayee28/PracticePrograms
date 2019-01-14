package String_package;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class CharOccurenceNoPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		String str=sc.next();
		new CharOccurenceNoPrint().getOccurenceString(str);
	}
	public void getOccurenceString(String str)
	{
		String str1[]=str.split("");
		LinkedHashMap<String,Integer>hm=new LinkedHashMap<String,Integer>();
		for(int i=0;i<str1.length;i++)
		{
			int cnt=1;
			for(int j=i+1;j<str1.length;j++)
			{
				if(str1[i].equals(str1[j]))
				{
					cnt++;
				}
			}
			if(hm.containsKey(str1[i]))
			{
				continue;
			}
			hm.put(str1[i],cnt);
		}
		Set<Entry<String,Integer>>e=hm.entrySet();
		for(Entry<String,Integer>entry:e)
		{
			System.out.print(entry.getKey()+entry.getValue());
		}
	}
}
