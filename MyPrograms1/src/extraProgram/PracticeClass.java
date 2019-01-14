package extraProgram;

public class PracticeClass {

	public static void main(String[] args) {
		B b=new B();
		b.m2();
	}

}
class A{
	static int i=10;
}
class B extends A
{
	public void m2()
	{
		System.out.println(i);
	}
}