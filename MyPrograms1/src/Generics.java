import java.util.ArrayList;

final class  GenericClass<T extends Number,E extends Object>
{
	final private T cid;
	final private E cname;
	final private ArrayList<? super Product>al;
	 
	public GenericClass(T cid, E cname, ArrayList<? super Product> al) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.al = al;
	}
	

	public T getCid() {
		return cid;
	}
	
	public E getCname() {
		return cname;
	}	
	
	public ArrayList<? super Product> getAl() {
		return al;
	}

	@Override
	public String toString() {
		return "GenericClass [cid=" + cid + ", cname=" + cname + ", al=" + al + "]";
	}

	
		
}

final class Product
{
	final private int pid;
	final private String pname;
	public Product(int pid, String pname) {
		super();
		this.pid = pid;
		this.pname = pname;
	}
	
	public int getPid() {
		return pid;
	}
	
	public String getPname() {
		return pname;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + "]";
	}
	
	
}
public class Generics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Product>al=new ArrayList<Product>();
		al.add(new Product(1,"paste"));
		al.add(new Product(2,"toothPaste"));
		GenericClass<Float,String> gen=new GenericClass<>(10.00f,"tanamyee",al);
		System.out.println(gen);
		
		int x,y,z;
		y=100;
		x=y=z=200;
		boolean f=null instanceof Generics;
	
/*		ArrayList<String>alstr=new ArrayList<String>();
		ArrayList al1=new ArrayList();
		alstr.add("tanmayee");
		alstr.add("ninad");
		alstr.add("abcjuaejf");
		Generics g=new Generics();
		g.m1(alstr);
		g.m1(al1);
		g.m3(alstr);		
		g.m4(alstr);
	}
	public <E> void m1(ArrayList<E>al)
	{
		//return null;
		System.out.println("Within M1");
	}
	public void m2(ArrayList<Object>al)//type saftey for list ..
	//can add only object type or its child
	{
		
		System.out.println("Within M2");
	}
	public void m3(ArrayList<?>al)
	{
		al.add(null);
		System.out.println("M3");
	}
	public void m4(ArrayList<? extends Object>al)
	{
		System.out.println("M4");
	}
	public void m5(ArrayList<? super Object>al)
	{
		al.add("audbk");
		System.out.println("M5");
	}*/
	}
}

