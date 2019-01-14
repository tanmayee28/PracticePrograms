package opps;

public class PrivateInheritance {
	private int id;
	private String name;
	
	
	
	public PrivateInheritance() {
		super();
	}
	public PrivateInheritance(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public static PrivateInheritance getIntsatnce()
	{
		return new PrivateInheritance(1,"tanu");
	}

}
class Child extends PrivateInheritance
{
	int childid;
	String childname;
	
	public Child() {
		super();
	}

	public Child(int childid, String childname) {
		super(1,"again");
		this.childid = childid;
		this.childname = childname;
	}
}