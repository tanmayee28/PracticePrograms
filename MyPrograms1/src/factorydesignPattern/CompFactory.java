package factorydesignPattern;

public class CompFactory {
	
	public static ComputerInterface getComputer(String str)
	{
		if(str.equalsIgnoreCase("HP"))
			return new HPClass();
		if(str.equalsIgnoreCase("Dell"))
			return new DellClass();
		return null;
			
	}
	

}
