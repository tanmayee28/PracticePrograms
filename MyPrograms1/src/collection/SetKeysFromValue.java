package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class SetKeysFromValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer>hm=new HashMap<String,Integer>();
		hm.put("a",10);
		hm.put("b",18);
		hm.put("c",9);
		hm.put("d",10);
		hm.put("e",18);
		hm.put("f",10);
		hm.put("e",19);
		List<String>elist=fromValueKeySet(hm,10);
		
		for(Iterator i=elist.iterator();i.hasNext();)
		{
			System.out.println("For iterator :"+i.next());
		}
	//	byte by=(byte) 132;
		//System.out.println(by);
		//List<String>elist=fromValueKeySet(hm,10);
		//System.out.println("List of Keys haiving value 10 :"+elist);
		
	}
	public static List<String>fromValueKeySet(HashMap<String,Integer>hm,Integer svalue)
	{
		List<String>list=new ArrayList<String>();
		Set<Entry<String,Integer>>set=hm.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			Entry<String,Integer>entry=(Entry<String, Integer>) itr.next();
			if(svalue==entry.getValue())
			{
				list.add(entry.getKey());
			}
		}
		return list;
		
	}

}
