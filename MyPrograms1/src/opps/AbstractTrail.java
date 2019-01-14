package opps;

public class AbstractTrail {
	public static void main(String[] args) {
	
		A a=new B();
		B b=new B();
		a.m3();
		
	}
	
}
 class A
{
	//public abstract void m3();
	void m3()
	{
		System.out.println("M3 Class A");
	}
	public void m1()
	{
		System.out.println("M1");
	}
}
 class B extends A
 {
	public void m2()
	{
		System.out.println("M2");
	}

	public void m3() {
		// TODO Auto-generated method stub
		System.out.println("M3");
	}
 }