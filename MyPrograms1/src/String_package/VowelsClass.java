package String_package;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class VowelsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Aminbuio";
		String st[]=str.split("");
		HashMap<String,Integer>hm=new HashMap<String,Integer>();
		for(int i=0;i<st.length;i++)
		{
			
			if(st[i].equals("a") || st[i].equals("e")||st[i].equals("i")||st[i].equals("o")||st[i].equals("u")||st[i].equals("A") ||st[i].equals("E")||st[i].equals("I")||st[i].equals("O")||st[i].equals("U") )
			{
				int cnt=1;
				for(int j=i+1;j<st.length;j++)
				{
					if(st[i].equals(st[j]))
					{
						cnt++;
					}
				}
				if(hm.containsKey(st[i]))
				{
					continue;
				}
				hm.put(st[i],cnt++);
			}
		}
		System.out.println(hm);
		Set<Entry<String,Integer>>set=hm.entrySet();
		int max=0;
		Entry<String,Integer>en = null;
		for(Entry<String,Integer>e:set)
		{
			if(e.getValue()>max)
			{
				max=e.getValue();
				en=e;
			}
		}
		System.out.println("Max Vowels count :"+en);
	}
	
	
	
	static void vowelsCountArray(String st)
	{	
		String[]starr=st.split("");
	}
	
	
}
