package Number_Pkg;

import java.util.Arrays;

public class Sagregate01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {0,1,1,1,0,0,1,0,0,1};
		//saggregate(arr);
		quicksort();
	}
	public static void saggregate(int []arr)
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
				count++;
		}
		for(int j=0;j<count;j++)
		{
			arr[j]=0;
		}
		for(int j=count;j<arr.length;j++)
		{
			arr[j]=1;
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void quicksort()
	{
		int arr[]= {1,1,1,0,0,1,0,0,0,1,0,1};
		int i=0,j=arr.length-1;
		while(i<j)
		{
			if(arr[i]==0&&i<j)
			{	
				i++;
			}else	if(arr[j]==1&&i<j){ 
				j--;
			}else if(i<j)
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}
		}
		System.out.println("Arrays :"+Arrays.toString(arr));
	}
}
