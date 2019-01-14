package InnerClass;

public class StaticNestedClass {
	int empid;
	String empname;
	double salary;
	
	public StaticNestedClass()
	{
		super();
		this.empid = empid;
		this.empname = empname;
		this.salary=salary;
		
	}
	public StaticNestedClass(int empid, String empname,double salary) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.salary=salary;
	}
	
	public static class SalaryClass
	{
		public double calculateSalary()
		{
			
			return (new StaticNestedClass(12,"Tanmayee",1000000).salary / 12);
			
		}
		
		
	}
	
	

}
