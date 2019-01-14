 package String_package;

import java.util.Arrays;

public class DuplicatesRemoval {

	public static void main(String[] args) {
		int []arr= {12,20,67,30,35};
		int []arr1=new int[arr.length];
		int len=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					//System.out.println(arr[i]);
					break;
				}
				
				arr1[i]=arr[i];	
			}
		}
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]!=0)
			{
				len++;
			}
		}
		int arr2[]=new int[len];
		int h=0;
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]!=0)
			{
				
				arr2[h]=arr1[i];
				h++;
				
			}
		}
		System.out.println(Arrays.toString(arr2));
		
	}

}
