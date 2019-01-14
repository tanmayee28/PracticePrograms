package InnerClass;

public class InnerMain {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		/*InnerClass in=new InnerClass(1);
		InnerClass.InnerTrial ind=in.new InnerTrial();
		
		//ind.m1();
		
		
		InnerClass.InnerTrial trial=new InnerClass(10).new InnerTrial();
	//	trial.m1();
		
		InnerClass.InnerTrial ctri=trial.Clone();
		System.out.println(ctri);
		
		
		
		//new InnerClass(12).new InnerTrial().m1();
*/	
		
			
		
		/*
		MethodInnerClass m=new MethodInnerClass(4);
		m.area();*/
		
		
		
		/*StaticNestedClass.SalaryClass st=new StaticNestedClass. SalaryClass();
		double dt=st.calculateSalary();
		System.out.println("Salary Per Month :"+dt);*/
	
	
		AnonymousClass ab=new AnonymousClass() {

			@Override
			public void m1() {
				// TODO Auto-generated method stub
				System.out.println("Overriding m1");
			}
			
		};
		ab.m1();
	}

}
