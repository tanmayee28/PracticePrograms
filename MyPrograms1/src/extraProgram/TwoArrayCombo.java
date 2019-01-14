package extraProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class TwoArrayCombo {

	public static void main(String[] args) {
		Integer arr[]= {7,3,2,null,8,10,null,60,23,45,44,44,88};
		Integer arr1[]= {51,null,51,65,23,54,54,55,89};
		
		combineArray(arr,arr1);
		listArrayCombo(arr,arr1);

	}
	public static void combineArray(Integer []arr,Integer[]arr1)
	{
		int len1=arr.length,max=0,min=0, i=0;
		int len2=arr1.length;
		TreeSet<Integer>set=new TreeSet<Integer>();
		if(len1>len2)
		{
			max=len1;
			min=len2;
		}else {
			max=len2;
			min=len1;
		}
		for( i=0;i<max;i++ )
		{
			try {
			if(i<min)
			{
				set.add(arr[i]);
				set.add(arr1[i]);
			}else {
					if(max==arr.length){
						set.add(arr[i]);
					}
					if(max==arr1.length)
					{
						set.add(arr1[i]);
					}
			}
		}
		catch(NullPointerException e)
			{
			continue;
			}
		}
		System.out.println(" Set :"+set);
	}
	
	public static void listArrayCombo(Integer[]arr,Integer[]arr1)
	{
		List<Integer>list1=Arrays.asList(arr);
		List<Integer>l2=Arrays.asList(arr1);
		ArrayList<Integer>list2=new ArrayList<Integer>(l2); 
		list2.addAll(list1);
		Iterator itr=list2.iterator();
		while(itr.hasNext())
		{
			Integer i=(Integer) itr.next();
			if(i==null)
				itr.remove();
		}
		TreeSet<Integer>tset=new TreeSet<Integer>(list2);
		System.out.println(tset);
	}
}
