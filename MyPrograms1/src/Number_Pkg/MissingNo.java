package Number_Pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MissingNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of an array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter your data :");
		for(int i=0;i<n-1;i++)
		{
			arr[i]=sc.nextInt();
		}
		Integer[]a= { 2, 3, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 18, 20, 21, 23};
		new MissingNo().getMissingNo(arr);*/
		
		
		Integer[]a= { 2, 3, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 18, 20, 21, 23};
		missingNo(a);
		List<Integer>list=new ArrayList<>();
		for(int i=0;i<100;i++)
		{
			list.add(i);
		}
		
		List<Integer>list2=Arrays.asList(a);
		//collectionMissing(list,list2);
	}

	public void getMissingNo(int[] arr) {
		int sum=0,len=arr.length;
		for(int i=0;i<len;i++)
		{
			sum+=arr[i];
		}
		int total=(len*(len+1))/2;
		
		System.out.println("Missing No:"+(total-sum));
		
	}
	
	static void missingNo(Integer []a)
	{
		Arrays.sort(a);
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i+1]-a[i]!=1)
			{
			//	System.out.println("Missing no:");
				System.out.println(a[i+1]-1);
			}
		}
	}
	
	public static void collectionMissing(List l1,List l2)
	{
		List<Integer>list2=new ArrayList<Integer>();
		list2.addAll(l1);
		list2.removeAll(l2);
		
		System.out.println("Missing No:"+list2);
	}

}
