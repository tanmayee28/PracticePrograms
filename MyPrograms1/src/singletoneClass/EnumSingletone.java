package singletoneClass;

public class EnumSingletone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mySingletone i=mySingletone.mySingletonevar;
		mySingletone i1=mySingletone.mySingletonevar;
		
		System.out.println(i==i1);
	
	}

}
enum mySingletone
{
	mySingletonevar(1,"Tanu");
	private int id;
	private String name;
	private mySingletone(int i,String name) 
	{
		this.id=id;
		this.name=name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
