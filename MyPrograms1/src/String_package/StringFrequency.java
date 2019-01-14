package String_package;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class StringFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>al=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 6 Colors :");
		for(int i=0;i<6;i++)
		{
			String str=sc.next();
			al.add(str);
		}
		new StringFrequency().getOcurrence(al);
	}
	public void getOcurrence(ArrayList<String>al)
	{
		HashMap<Object,Integer>hm=new HashMap<Object,Integer>();
		Object []sarray= al.toArray();
		for(int i=0;i<sarray.length;i++)
		{
			int cnt=1;
			for(int j=i+1;j<sarray.length;j++)
			{
				if(sarray[i].equals(sarray[j]))
				{
					cnt++;
				}
			}
			if(hm.containsKey(sarray[i]))
			{
				continue;
			}else
			{
				hm.put(sarray[i],cnt);
			}
		}
		System.out.println(hm);
	}
	
}
