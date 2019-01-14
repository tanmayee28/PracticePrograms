package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			HashMap<Integer,String>hm=new HashMap<Integer,String>();
			hm.put(1,"tanu");
			hm.put(4,"soniya");
			hm.put(9,"ninad");
			hm.put(3,"Sushant");
			hm.put(8,"Varsha");
			hm.put(6,"Konark");
			hm.put(null,"trial");
			
			System.out.println("null value :"+hm.get(null));
			
			Set<Integer>kset=hm.keySet();
			Iterator<Integer>itr=kset.iterator();
			while(itr.hasNext())
			{
				Integer no=itr.next();
				System.out.println(hm.get(no));
			}
			
			Collection<String>list=hm.values();
			Iterator<String>litr=list.iterator();
			while(litr.hasNext())
			{
				String val=litr.next();
				System.out.println(val);
			}
			//from values key
			Set<Entry<Integer,String>>elist=hm.entrySet();
			Iterator<Entry<Integer,String>>eitr=elist.iterator();
			while(eitr.hasNext())
			{
				Entry<Integer,String>en=eitr.next();
				if(en.getValue().equals("trial"))
				{
					System.out.println("Key with value 'trial' :"+en.getKey());
				}
				
			}
			
	}

}
