package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListImplements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	List list=new ArrayList();
		list.add("A");
		list.add("B");
		list.add(null);
		list.add(4);
		list.add(3);
		list.add(3);
		list.add(5,"A");
		System.out.println(" List :"+list);
		
		System.out.println(" 5th element:"+list.get(5));
		System.out.println(" index of 'null' :"+list.indexOf(null));
		System.out.println(" last index of '3' :"+list.lastIndexOf(3));
		 */
		
		List<String>list1=new ArrayList<>(7);
		System.out.println("Initial capacity :"+list1.size());
		list1.add("A");
		list1.add("B");
		list1.add("RT");
		list1.add("TRY");
		list1.add("CRT");
		list1.add("BDC");
		System.out.println("Initial capacity :"+list1.size());
		System.out.println("Here capacity increased");
		list1.add("A");
		list1.add("AB");
		list1.add("AB");
		list1.set(8,"End");
		list1.add(1, "A1");
		System.out.println("Increased Capacity :"+list1.size());

		Collections.sort(list1);
		list1.sort(null);
		
		System.out.println(list1);
		ListIterator<String>litr=list1.listIterator();
		while(litr.hasNext())
		{
			String str1=litr.next();
			System.out.println(str1);
		}
		
		Object[]arr=list1.toArray();
		System.out.println(Arrays.asList(arr));
		/*Iterator itr=list1.iterator();
		while(itr.hasNext())
		{
			String str=(String) itr.next();
			System.out.println(str);
		}*/
		
		List<String>sub=list1.subList(2,6);
		System.out.println("Sublist :"+sub);
	}

}
