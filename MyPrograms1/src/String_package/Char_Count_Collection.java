package String_package;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ExecutorService;

public class Char_Count_Collection {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter Your String :");
		String str=sc.next();
		
		new Char_Count_Collection().getCount(str);
	}
	public void getCount(String str)
	{
		ExecutorService ex;
		char[]ch=str.toCharArray();
		LinkedHashMap <Character,Integer> hm=new LinkedHashMap<Character,Integer>();
		for(int i=0;i<ch.length;i++)
		{
			int cnt=1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					cnt++;
				}
			}
			if(hm.containsKey(ch[i]))
			{
				continue;
			}
			hm.put(ch[i],cnt);
		}
		System.out.println(hm);
		Set<Entry<Character,Integer>>entry=hm.entrySet();
		int max=0;
		Entry<Character,Integer>emax=null;
		for(Entry<Character,Integer>e:entry)
		{
			if(e.getValue()>max)
			{
				max=e.getValue();
				emax=e;
			}
			
		}
		System.out.println("Entry :"+emax);
	}
	
	}
