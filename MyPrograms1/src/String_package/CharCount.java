package String_package;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class CharCount {
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your String");
		String str=sc.next();
		new CharCount().getCount(str);
	}
	public void getCount(String str)
	{
		HashMap<Character,Integer>hm=new HashMap<>();
		
		char[]chr=str.toCharArray();
		for(int i=0;i<chr.length;i++)
		{
			int cnt=1;
			for(int j=i+1;j<chr.length;j++)
			{
				if(chr[i]==chr[j])
				{
					cnt++;
				}
			}
			if(hm.containsKey(chr[i]))
			{
				continue;
			}else 
			{
				hm.put(chr[i],cnt);
			}			
		}	
		new CharCount().getCharCount(hm);	
		}
	
	public void getCharCount(HashMap<Character,Integer>hm) {
		Set<Entry<Character,Integer>>set=hm.entrySet();
		int max=0;
		HashMap<String , Entry > myhm = new HashMap<>();
		
		for(Entry<Character,Integer>entry:set)
		{
			if(max<entry.getValue())
			{
				max=entry.getValue();
				myhm.put("top", entry);
			}
			
		}
		Entry e=myhm.get("top");
		System.out.println(e);
		
	}
	
}
