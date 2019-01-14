package concurrentMap;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class ConcurrentHashmapImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConcurrentHashMap<Integer,String>cmap=new ConcurrentHashMap<>();
		ConcurrentHashMap cmap1=new ConcurrentHashMap();
		cmap1.put(1,"123");
		cmap1.put(12.5,"ABC");
		System.out.println("Map :"+cmap1);
		//System.out.println(cmap);
		/*for(int i=0;i<7;i++)
		{
			cmap.put(i*5,"ABC"+i);
		}
		System.out.println(" Collection :"+cmap);
		Collection<String>setval=cmap.values();
		Iterator itr=setval.iterator();
		while(itr.hasNext())
		{
			String str=(String) itr.next();
			if(str.equals("ABC2"))
			{
				System.out.println("Key-Value "+str);
			}
		}*/

	}

}
