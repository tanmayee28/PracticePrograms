package Number_Pkg;

import java.util.Arrays;

public class DuplicateAgain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []a= {10,12,67,12,20,20};
		Arrays.sort(a);
		int n=a.length;
		int len=removeDuplicate(a,n);
		System.out.println(len);
		for(int i=0;i<len;i++)
		{
			System.out.println(a[i]);
		}
	}
public static  int removeDuplicate(int a[],int l)
{
	if(l==0 || l==1)
		return l;
	
	int j=0;
	for(int i=0;i<l-1;i++)
	{
		if(a[i]!=a[i+1])
		{
			a[j++]=a[i];
		}
	}
	a[j++]=a[l-1];
	
	return j;
	
}

}