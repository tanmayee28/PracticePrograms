package InnerClass;

public class InnerClass {
	
	private int id;
	private static String name="tanu";
	
	
	
	public InnerClass(int id) {
		super();
		this.id = id;
	}



	public class InnerTrial implements Cloneable
	{
		public void m1()
		{
			System.out.println("Id :"+id);
			System.out.println("Name :"+name);
		}
		
		public InnerTrial Clone() throws CloneNotSupportedException
		{
			return (InnerTrial) super.clone();
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			try {
				return "InnerTrial [Clone()=" + Clone() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
						+ ", toString()=" + super.toString() + "]";
			} catch (CloneNotSupportedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}
		
	}

}
