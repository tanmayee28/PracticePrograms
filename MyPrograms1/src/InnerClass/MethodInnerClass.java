package InnerClass;

public class MethodInnerClass {
	private int radius;
	private double area;
	
	public MethodInnerClass(int radius) {
		super();
		this.radius = radius;
	}
	
	public void area()
	{
		 int id=12;
		class InnerArea{
			double iare=0.0;
			double darea()
			{
				System.out.println(id);
				iare=3.14*radius*radius;
				return iare;
			}
		}
		InnerArea i=new InnerArea();
		double d=i.darea();
		System.out.println("Area :"+d);
	}

}
