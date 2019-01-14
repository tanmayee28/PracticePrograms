package factorydesignPattern;

public class DellClass implements ComputerInterface {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		System.out.println("Computer name is :");
		return "Dell";
	}

	@Override
	public int getRAM() {
		// TODO Auto-generated method stub
		System.out.println("RAM in GB is :");
		return 5;
	}

	@Override
	public int getHardDisk() {
		// TODO Auto-generated method stub
		System.out.println("HardDisk in GB is :");
		return 505;
	}

	@Override
	public String getCore() {
		// TODO Auto-generated method stub
		System.out.println("Core of a processor is :");
		return "i5";
	}

}
