package String_package;

import java.util.Arrays;
import java.util.HashMap;

public class LongestSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="tanmtayee";
		longestSubstring(str);
	}

	
	public static void longestSubstring(String str) {
		
		String []s=str.split("");
		System.out.println(Arrays.toString(s));
		String sub="";
		HashMap<String,Integer>hm=new HashMap<String,Integer>();
		
		
		for(int i=0;i<str.length();i++)
		{
			
		
			int count = 0;
			for(int j=i+1;j<str.length();j++)
			{   
				
				System.out.println("s[i] = "+s[i] +" s[j] "+s[j]);
				if(s[i].equals(s[j]))
				{
					System.out.println(s[i]+" break ");
					
					hm.put(sub, count);
					sub="";
					break;
				}

							
			  
				
				
			}
			sub+=s[i];
			//System.out.println("empty str "+sub);
			count++;
			}
		
		System.out.println("hm "+hm);
		if(true)
		{
			System.out.println("hi");
		}else if(true)
		{
			System.out.println("hii2");
		}
	}

}
