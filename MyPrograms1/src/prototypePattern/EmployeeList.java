package prototypePattern;

import java.util.ArrayList;
import java.util.List;

import collection.EmployeeClass;

public class EmployeeList implements Cloneable{
	List<String>list=new ArrayList<>();

	
	public EmployeeList() {
		super();
		this.list=list;
		
	}

	public EmployeeList(List<String> list) {
		this.list = list;
	}

	public List<String> getList() {
		return list;
	}
	public void loadData()
	{
		list.add("Tanmayee");
		list.add("Pranjali");
		list.add("Sau");
		list.add("We");
		list.add("All");
		list.add("are");
		list.add("Fucked");
		list.add("Up");
	}
	public Object Clone() throws CloneNotSupportedException
	{
		List<String>emp=new ArrayList<>();
		for(String str:list)
		{
			emp.add(str);
		}
		return new EmployeeList(emp);
		
		
	}

	@Override
	public String toString() {
		return "EmployeeList [list=" + list + "]";
	}
	
}
