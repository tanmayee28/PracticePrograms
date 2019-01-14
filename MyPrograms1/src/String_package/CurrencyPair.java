package String_package;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class CurrencyPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String>al=new ArrayList<String>();
		al.add("AUS");
		al.add("DOL");
		al.add("EURO");
		al.add("RUPEE");
		
		//new CurrencyPair().getPairs(al);
		new CurrencyPair().pairedArray(al);
	}

	public void getPairs(ArrayList<String>al)
	{
		String[] sarray = new String[al.size() + 1];
		int my = 0;
		String con = "";
		LinkedHashSet<String> hm = new LinkedHashSet<String>();
		// HashSet<String>hm=new HashSet<String>();
		for (String s : al) {
			sarray[my] = s;
			if (my == 0) {
				sarray[al.size()] = s;
			}
			my++;
		}
		for (int i = 0; i < sarray.length; i++) {
			con = sarray[i] + "-";
			for (int j = i + 1; j < sarray.length; j++) {
				con += sarray[j];
				//System.out.println(con);
				hm.add(con);
				break;
			}
		}

		System.out.println(hm);
	}
	
	public void pairedArray(ArrayList<String>al)
	{
		String arr[]=new String[al.size()+1];
		HashSet<String>set=new HashSet<String>();
		int index=0;
		for(String s:al)
		{
			arr[index]=s;
			if(index==0)
				arr[al.size()]=s;
			index++;
			
		}
		for(int i=0;i<arr.length;i++)
		{
			String conc=arr[i]+"-";
			for(int j=i+1;j<arr.length;j++)
			{
				conc=conc+arr[j];
				set.add(conc);
				break;
			}
			
		}
		System.out.println("List :"+set);
		
	}
}
