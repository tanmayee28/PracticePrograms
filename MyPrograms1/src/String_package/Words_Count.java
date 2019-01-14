package String_package;

import java.util.HashMap;
import java.util.Scanner;

public class Words_Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your sentence:");
		String str=sc.nextLine();
		
		new Words_Count().getWordCount(str);
	}
	public void getWordCount(String str)
	{
		String[]str1=str.split(" ");
		HashMap<String,Integer>hm=new HashMap<String,Integer>();
		for(int i=0;i<str1.length;i++)
		{
			String con=str1[i];
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
		System.out.println(hm);
		System.out.println("the="+hm.get("the"));
	}
	
}
