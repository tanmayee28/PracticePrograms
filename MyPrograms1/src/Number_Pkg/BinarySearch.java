package Number_Pkg;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr[]= {12,67,34,90,5,30};
		Arrays.sort(arr);
		System.out.println("Sorted Array :"+Arrays.toString(arr));
		System.out.println("Enter no to be search :");
		int no=sc.nextInt();
		int mid=(arr.length)/2;
		System.out.println(mid);
		if(arr[mid]==no)
		{
			System.out.println("No "+no+" found at position "+mid);
		}
		if(arr[mid]>no)
		{
			bSearch(arr,0,mid,no);
		}
		if(arr[mid]<no)
		{
			bSearch(arr,mid+1,arr.length,no);
		}
		else {
		
				System.out.println("No not found");
		}
		
	}
	public static void bSearch(int []a,int start,int end,int sno)
	{
		for(int i=start;i<end;i++)
		{
			if(a[i]==sno)
			{
				System.out.println("No "+sno+" found at position "+i);
			}
		}
	}

}
