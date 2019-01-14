package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

public class Comparableclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1=new Employee(1,"XYZ");
		Employee e2=new Employee(5,"ABC");
		Employee e3=new Employee(12,"rt");
		Employee e4=new Employee(8,"abc");
		Employee e5=new Employee(23,"pqr");
		Employee e6=new Employee(6,"HRS");
		Employee e7=new Employee(9,"vTz");
		List<Employee>list=new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);
		list.add(e7);
		list.sort(null);
		System.out.println(list);
		/*System.out.println("Before Sorting :"+list);
		Collections.sort(list);
		System.out.println("After sorting :"+list);
*/		
		/*TreeSet<Employee> ts=new TreeSet(list);
		System.out.println("Using TreeSet :"+ts);
		*/
		Integer i=new Integer(10);
		Integer i1=new Integer(10);
		Integer i2=new Integer(10);
		Integer i3=new Integer(10);
		
		TreeSet<Integer>ts=new TreeSet<>();
		ts.add(i);
		ts.add(i1);
		ts.add(i2);
		ts.add(i3);
		
		System.out.println("TreeSet :"+ts);

	}

}
