package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class IteratorsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v=new Vector<>();
		v.add("ABC");
		v.addElement("ABER");
		v.addElement("Tanu");
		System.out.println(" Vector :"+v);
		
		Enumeration e=v.elements();
		while(e.hasMoreElements())
		{
			String str1=(String) e.nextElement();
			System.out.println(str1);
		}
		System.out.println("\n");
		ListIterator<String>iterator=v.listIterator();
		while(iterator.hasNext())
		{
			String tri2=iterator.next();
			System.out.println(tri2);
		}
		System.out.println("\n");
		Iterator<String>itr1=v.iterator();
		while(itr1.hasNext())
		{
			String s1=itr1.next();
			System.out.println(s1);
		}
		
	}

}
