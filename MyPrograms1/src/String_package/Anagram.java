package String_package;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-genated method stub
		
		a ab=new b();
		ab.m1("abc");
		/*
		BlockingQueue bq=new ArrayBlockingQueue(10);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String 1");
		String str1=sc.next();
		String str2=sc.next();
		//new Anagram().isAnagram(str1, str2);
		new Anagram().anaGram(str1, str2);*/
	}
	
	public void isAnagram(String str1,String str2)
	{
		String[]ch=str1.split("");
		String[]ch1=str2.split("");
		
		List<String>l1=Arrays.asList(ch);
		List<String>l2=Arrays.asList(ch1);
		List<String>l3=new ArrayList<String>();
		l3.addAll(l1);
		System.out.println(l3);
		l1.removeAll(l2);
		System.out.println(l1);
		if(l2.size()==0)
		{
			System.out.println("Strings are Anagram..");
		}else {
			System.out.println("Strings are not Anagram..");
		}
	}
	public void anaGram(String s1,String s2)
	{
		char[] sarr=s1.toCharArray();
		char[] sarr1=s2.toCharArray();
		
		Arrays.sort(sarr);
		Arrays.sort(sarr1);
		
		if(sarr.length==0)
			System.out.println("not anagram");
		if(sarr.length!=sarr1.length)
			System.out.println("Not anagram");
		if(Arrays.equals(sarr,sarr1))
			System.out.println("Strings are anagrams.");
		
	}
	
	
}


class a{
	
	public void m1( Object o ) {
		System.out.println("a");
	}
} 

class b extends a {
  public void m1( StringBuffer o ) {
	  System.out.println("b");
	}	
}
