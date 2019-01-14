package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Demo {
	public static void main(String[] args) {
		/*ArrayList<String> al=new ArrayList<>();
		al.add("sau");
		al.add("tanu");
		al.add("pranj");
		
		System.out.println(al);
		Object [] ob=al.toArray();
		System.out.println(ob.toString());
		System.out.println(Arrays.toString(ob));*/
		
		
		
			Employee emp1=new Employee(27,"Martin");
			Employee emp2=new Employee(27,"John");
			Map<Employee,String> hm=new HashMap<Employee,String>();
			hm.put(emp1, "Verified");
			//hm.put(emp2, "Varified1");
			//System.out.println(hm);
			emp1.setEmpName("John");
			System.out.println(hm.get(emp2));
			//System.out.println(hm);
		
			
	}
}
