package String_package;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MaxCharOccurence {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string :");
		String str=sc.nextLine();
		new MaxCharOccurence().getMaxCount(str);
		usingList();
	}

	public void getMaxCount(String str) {
		String[]sarr=str.split("");
		System.out.println(Arrays.toString(sarr));
		
		HashMap<String,Integer>hm=new HashMap<String,Integer>();
		for(int i=0;i<sarr.length;i++)
		{
			Integer cnt=1;
			
			for(int j=i+1;j<sarr.length;j++)
			{
	
				if(sarr[i].equals(sarr[j]))
				{
					cnt++;
				}
			}
			if(hm.containsKey(sarr[i]))
			{
				continue;
			}
			else {
				hm.put(sarr[i],cnt);
			}
		}
		System.out.println("Map :"+hm);
		new MaxCharOccurence().getMaxCharCount(hm);
	}

	public void getMaxCharCount(HashMap<String, Integer> hm) {
		Set<Entry<String,Integer>>set=hm.entrySet();
		Integer max=0;
		HashMap<String,Entry<String,Integer>>rhm=new HashMap<>();
		for(Entry<String,Integer>entry:set)
		{
			if(max<entry.getValue())
			{
				max=entry.getValue();
				rhm.put("Top",entry);
			}
		}
		System.out.println("Max Count :"+rhm.get("Top"));
	}
	public static void usingList()
	{
		ArrayList<String>ar=new ArrayList<String>();
		ar.add("a");
		ar.add("a");
		ar.add("b");
		ar.add("b");
		ar.add("b");
		ar.add("c");
		ar.add("d");
		ar.add("d");
		ar.add("d");
		ar.add("d");
		HashMap<String,Integer>hmap=new HashMap<String,Integer>();
		for(int i=0;i<ar.size();i++)
		{
			int cnt=1;
			for(int j=i+1;j<ar.size();j++)
			{
				if(ar.get(i).equals(ar.get(j)))
				{
					cnt++;
					
				}
				
			}
			if(hmap.containsKey(ar.get(i)))
			{
				continue;
			}
			hmap.put(ar.get(i),cnt);
		}
		System.out.println(hmap);
	}
	

}
