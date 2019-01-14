package prototypePattern;

public class PrototypeMain {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		EmployeeList emp=new EmployeeList();
		emp.loadData();
		System.out.println(emp.getList());
		
		EmployeeList emp1=(EmployeeList) emp.Clone();
		EmployeeList emp2=(EmployeeList) emp.Clone();
		
		System.out.println(emp1.getList());
		System.out.println(emp2.getList());
	}

}
