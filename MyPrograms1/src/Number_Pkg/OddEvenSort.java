package Number_Pkg;

import java.util.Arrays;

public class OddEvenSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {12,1,3,54,6,23,8,4};
		new OddEvenSort().swap(arr);
			
	}
	public void swap(int []arr)
	{
		int j= arr.length-1;
		int i=0;
		while(i<j) {
			if(arr[i]%2==0 && i<j )
			{
				i++;
			}else if(arr[j]%2==1 && i<j)
			{
				j--;
			}else if(i<j){
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
			
			
			
			
			/*while(arr[i]%2!=0) {
			   
				 int temp = arr[j];
				    arr[j]=arr[i];
				    arr[i]=temp;
				    if(isEven(arr[i]))
				    {
				    	break;	
				    }
				    else {
				    	j--;
				    }
				}*/
	
	
}
	