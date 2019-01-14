package AtomicStampedReference;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicStampedReference;

public class AtomicStampedClass {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		String str=" Initial reference";
		String newstr=" new Initial reference";
		AtomicStampedReference ref=new AtomicStampedReference(str,0);
		
		System.out.println(ref.compareAndSet(str, newstr,ref.getStamp(), 420));
		System.out.println("ref  :  "+ref);
		
		//to get the refrence from untyped atomicstampedref
		String ref1=(String) ref.getReference();
		System.out.println(" Refrerence :"+ref1);
		  
		System.out.println(" stamped1 :"+ ref.getStamp());
		
		//from typed Atomicref
		AtomicStampedReference<String> tref=new AtomicStampedReference<>(str,1);
		
		String tref1=tref.getReference();
		
		System.out.println(" typed Reference:"+tref1);
		System.out.println(" typed reference stamp :"+tref.getStamp());
		
	/*	//To get refrence and stamped using get() atomatically
		int[] stamp=new int[1];
		//Object o=ref.get(stamp[0]);
		System.out.println(" get refrence from get:"+ stamp[0]);*/
		
		/*IdentityHashMap<String , String > idhm;
		
		HashMap<String , String >hm;
		
		
		
		Person p=new Person(1,"Tanmayee");
		Person p3=p;
		Person p1=new Person(1,"Tanmayee");
		Person p2=new Person(2,"Tanu");
		AtomicReference<Person>at=new AtomicReference<>(p);
		String t="Tanmayee1";
		String astring="Ninad";
		System.out.println(at.compareAndSet(p3,p2));
		System.out.println(at);*/
		
	}

}

