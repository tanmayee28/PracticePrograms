package String_package;

import java.time.LocalDate;
import java.util.concurrent.ThreadLocalRandom;

public class FirstNonRecursiveChar {

	public static void main(String[] args) {
		/*String str="tanmayee";
		String []s=str.split("");
		int j=0;
		while(j<str.length())
		{
			if(str.indexOf(j)==str.lastIndexOf(j))
			{
					System.out.println("First non repetative:"+s[j]);
					break;
			}
			j++;
		}
		*/
		secondMax();
		/*String name="Tanmayee";
		LocalDate date =LocalDate.now();
		int no=ThreadLocalRandom.current().nextInt();
		String so=date.getDayOfYear()+name.substring(0, 3)+no;
		System.out.println("So="+so);*/
	}
	public static void secondMax()
	{
		int []arr= {12,65,34,98,6,70};
		int max=arr[0],smax=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				smax=max;
				max=arr[i];	
			}else if(arr[i]>smax){
					
					smax=arr[i];
				}
		}
		System.out.println(smax);
		
		
	}
}

