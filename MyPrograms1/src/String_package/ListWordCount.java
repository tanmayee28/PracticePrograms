package String_package;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class ListWordCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of list :");
		int size=sc.nextInt();
		List<String>l=new ArrayList<String>();
		System.out.println("Enter "+size+" words :");
		for(int i=0;i<size;i++)
		{
			String s=sc.next();
			l.add(s);
			
		}
		wordFrequency(l);
		
	}
	public static void wordFrequency(List<String>l)
	{
		HashMap<String,Integer>hm=new HashMap<String,Integer>();
		for(int i=0;i<l.size();i++)
		{
			int cnt=1;
			for(int j=i+1;j<l.size();j++)
			{
				if(l.get(i).equals(l.get(j)))
				{
					System.out.println(l.get(i)+l.get(j));
					cnt++;
				}
			}
			if(hm.containsKey(l.get(i)))
			{
				continue;
			}
			hm.put(l.get(i),cnt);
		}
		System.out.println(hm);
		
		
	}

}
