package collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class HMResize {

	public static void main(String[] args) {
		
		TreeSet<Exp>tset=new TreeSet<Exp>();
		tset.add(new Exp(10));
		tset.add(new Exp(10));
		tset.add(new Exp(11));
		tset.add(new Exp(13));
		tset.add(new Exp(17));
		tset.add(new Exp(10));
		//System.out.println(tset);
		
		TreeSet set=new TreeSet();
		set.add(new Double(15));
		set.add(new Integer(10));
		set.add(new Integer(13));
		set.add(new Double(17));
		System.out.println(set);
	}

}
class Exp implements Comparable<Exp>
{
	int id;
	@Override
	public String toString() {
		return "Exp [id=" + id + "]";
	}

	public Exp(int id) {
		super();
		this.id = id;
	}

	@Override
	public int compareTo(Exp o) {
		// TODO Auto-generated method stub
		System.out.println("this :"+this.id);
		System.out.println("o.id :"+o.id);
		int temp=this.id-o.id;
		if(temp==0)
		{
			return 1;
		}
		return temp;
	}
	
}