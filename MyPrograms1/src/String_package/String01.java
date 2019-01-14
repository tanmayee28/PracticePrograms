package String_package;

import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;

public class String01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="0110011101010";
		stringsort1(str);
		quickSortString(str);
	}
	static void stringsort1(String str)
	{
		String result="";
		String []s=str.split("");
		int cnt=0;
		for(int i=0;i<s.length;i++)
		{
			if("0".equals(s[i]))
			{
				cnt++;
			}
		}
		for(int i=0;i<cnt;i++)
		{
			s[i]="0";
			result+=s[i];
			
		}
		for(int i=cnt;i<s.length;i++)
		{
			s[i]="1";
			result+=s[i];
		}
		System.out.println("Result :"+result);
	}
	static void quickSortString(String sb)
	{
		
		String [] sm=sb.split("");
		String result="";
		int i=0,j=sm.length-1;
		while(i<j)
		{
			if(sm[i].equals("0") && i<j)
			{
				result+=sm[i];
				i++;
			}
			if(sm[j].equals("1") && i<j)
			{
				//result+=sm[j];
				j--;
			}else if(i<j)
			{
				String temp=sm[i];
				sm[i]=sm[j];
				sm[j]=temp;
				result+=sm[i];
				i++;
				j--;
			}
			
		}
		
		System.out.println("Result :"+Arrays.toString(sm));
		System.out.println("Result :"+result);
		
	}
}
