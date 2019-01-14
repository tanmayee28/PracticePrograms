package Number_Pkg;

import java.util.Arrays;
import java.util.Scanner;

public class Second_MaxNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of an array :");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		//new Second_MaxNo().getSecondMax(arr);
		new Second_MaxNo().sortArray(arr);
	}

	public void getSecondMax(int[] arr) {
		
		Arrays.sort(arr);
		System.out.println("Array :"+Arrays.toString(arr));
		System.out.println("Second max:"+arr[arr.length-2]);
		
	}
	
	public void sortArray(int[]arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
		}
		System.out.println("Sorted array :"+Arrays.toString(arr));
		System.out.println("Second max :"+arr[arr.length-2]);
		
	}

}
