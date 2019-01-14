package opps;

import java.io.IOException;
import java.io.InterruptedIOException;

public class OverridingTest {

	public static void main(String[] args)  {
		
		
		int String =10;
		System.out.println(String);
		
		/*OveerridenClass over=new OverridingClass();*/
		/*try {
			over.m1();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		/*Runtime r=Runtime.getRuntime();
		Class ref=r.getClass();
		OverridenClass cl=(OverridenClass) ref.newInstance();
		*/
	}

}
class OverridenClass 
{	
	public void m1() throws IOException
	{
		System.out.println("M1");
	}
}
class OverridingClass extends OverridenClass
{
	
	public void m1()
	{
		System.out.println("m1 child");
	}
}

