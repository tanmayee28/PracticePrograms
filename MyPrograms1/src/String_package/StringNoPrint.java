package String_package;

import java.util.Scanner;

public class StringNoPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter Your String :");
		String str=sc.next();
		new StringNoPrint().checkNo(str);
	}

	public void checkNo(String str) {
		String[]sarr=str.split("");
		Integer no=0;
		for(int i=0;i<sarr.length;i++)
		{
			try {
				no=Integer.parseInt(sarr[i]);
			}catch(Exception e) {
				continue;
			}
			System.out.println(no);
		}
		
	}

}
