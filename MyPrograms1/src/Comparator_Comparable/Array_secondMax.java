package Comparator_Comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Array_secondMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Integer>tset=new TreeSet<>();
		tset.add(23);
		tset.add(10);
		tset.add(56);
		tset.add(12);
		tset.add(78);
		tset.add(8);
		new Array_secondMax().getSecondMaxNo(tset);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Length 0f an array: ");
		int len=sc.nextInt();
		Integer []array=new Integer[len];
		System.out.println("Enter Nos:");
		for(int i=0;i<len;i++)
		{
			array[i]=sc.nextInt();
		}
		
		//new Array_secondMax().getSecondMaxNoArray(array);
		
		//new Array_secondMax().getSecondMaxArray(array);
		
		new Array_secondMax().getSecondMaxList(array);
		
		
	}
	
	public void getSecondMaxList(Integer[] array) {
		// TODO Auto-generated method stub
		List<Integer>list=Arrays.asList(array);
		/*for(int i=0;i<array.length;i++)
		{
			list.add(array[i]);
		}*/
		
		Collections.sort(list);
		System.out.println(list);
		System.out.println("Second Max :"+list.get(list.size()-2));
		
	}

	public void getSecondMaxArray(Integer[] array) {
		// TODO Auto-generated method stub
		for(int i=0;i<array.length-1;i++)
		{
			if(array[i]>array[i+1])
			{
				int temp=array[i];
				array[i]=array[i+1];
				array[i+1]=temp;
			}
		}
		System.out.println(Arrays.toString(array));
	}

	public void getSecondMaxNo(TreeSet<Integer>tset)
	{
		TreeSet d=(TreeSet) tset.descendingSet();
		System.out.println(d);
		System.out.println(d.higher(d.first()));
		System.out.println(tset.lower(tset.pollLast()));
	}
	public void getSecondMaxNoArray(Integer []a)
	{
	
		int max=a[0],smax=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
				smax=max;
				max=a[i];
			
			}
			else if(a[i]>smax)
			{
				smax=a[i];
			}
			
		}
		System.out.println("Max :"+smax);
				
		//System.out.println(Arrays.toString(a));
		
	}
	
}
