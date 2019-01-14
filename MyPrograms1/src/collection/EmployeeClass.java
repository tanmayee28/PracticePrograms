package collection;

import java.util.Collections;
import java.util.Comparator;

public class EmployeeClass implements Comparator<EmployeeClass>
{
	
	int eid;
	String ename;
	public EmployeeClass(int eid, String e) {
		super();
		this.eid = eid;
		this.ename = e;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	@Override
	public String toString() {
	
		//Collections.sort(list);
		return "\n EmployeeClass [eid=" + eid + ", ename=" + ename + "]";
	}
	@Override
	public int compare(EmployeeClass o1, EmployeeClass o2) {
		// TODO Auto-generated method stub
		int temp=o1.getEid()-o2.getEid();
		if(temp==0)
		{
			return o1.getEname().compareTo(o2.getEname());
		}
		return temp;
	}
	

}
