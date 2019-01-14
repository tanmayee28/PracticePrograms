package CutomizedException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class CutomizedExceptionClass {
	String tanmayee="tanmayee";
	public static void main(String[] args) throws NoSuchFieldException, SecurityException {
		// TODO Auto-generated method stub
		
		CutomizedExceptionClass b=new CutomizedExceptionClass();
		b.getClass().getField("tanmayee");
		TreeSet tr=new TreeSet();
		HashSet hm=new HashSet();
		/*System.out.println("I am trying to create my own exception ..");
		try {
			
			
			throw new MyException("An exception");
		} catch (MyException e) {
			System.out.println("caught8	");
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
*/
	}

}
class MyException extends Exception  
{
	String str;

	public MyException(String str) {
		super(str);
		
	}
	
}