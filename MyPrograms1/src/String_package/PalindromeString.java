package String_package;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

import javax.swing.plaf.synth.SynthSpinnerUI;

import org.omg.Messaging.SyncScopeHelper;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("hii");
		HashSet<String>hm=new HashSet<>();
		
		hm.add("AB");
		hm.add("ey");
		hm.add("Ab");
		hm.add("cd");
		hm.add("CC");
		
		hm.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				// TODO Auto-generated method stub
				System.out.println(t);
			}
		});
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String 1");
		String str1=sc.next();
		
		stringPalindrome(str1);
	}
	public static void stringPalindrome(String str1)
	{
		String reverse="";
		for(int i=str1.length()-1;i>=0;i--)
		{
			reverse+=str1.charAt(i);
			System.out.println(reverse);
		}
		System.out.println(reverse);
		if(str1.equals(reverse))
		{
			
			System.out.println("palindrome..");
		}
		else 
		{
			
			System.out.println("Not Palindrome..");
		}
	}

}
