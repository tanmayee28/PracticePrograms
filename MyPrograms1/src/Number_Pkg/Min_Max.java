package Number_Pkg;

import java.util.Arrays;
import java.util.Scanner;

public class Min_Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of your array :");
		int len=sc.nextInt();
		int []array=new int[len];
		System.out.println("Enter your nos:");
		for(int i=0;i<len;i++)
		{
			array[i]=sc.nextInt();
		}
		
		System.out.println("Your Array :"+Arrays.toString(array));
		int max=new Min_Max().getMax(array);
		int min=new Min_Max().getMin(array);
		
		System.out.println("Max no :"+max);
		System.out.println("Min no :"+min);
		new Min_Max().sortArray(array);
	}
	public int getMax(int []array)
	{
		int max=0;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]>max)
			{
				max=array[i];
			}
		}
		return max;
		
	}
	
	public int getMin(int []array)
	{
		int min=array[0];
		for(int i=0;i<array.length;i++)
		{
			if(array[i]<min)
			{
				min=array[i];
			}
		}
		
		return min;
		
	}
	
	public void sortArray(int []array)
	{
		for(int i=0;i<array.length-1;i++)
		{
			if(array[i]>array[i+1])
			{
				int temp=array[i];
				array[i]=array[i+1];
				array[i+1]=temp;
			}
		}
		System.out.println("Sorted array :"+Arrays.toString(array));
	}
}
