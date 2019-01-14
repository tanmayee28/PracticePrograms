package factorydesignPattern;

public class HPClass implements ComputerInterface{

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		System.out.println("Name of your Laptop is :");
		return "Compaq HP";
	}

	@Override
	public int getRAM() {
		// TODO Auto-generated method stub
		System.out.println("RAM in GB is :");
		return 4;
	}

	@Override
	public int getHardDisk() {
		// TODO Auto-generated method stub
		System.out.println("HardDisk in GB is :");
		return 500;
	}

	@Override
	public String getCore() {
		// TODO Auto-generated method stub
		System.out.println("Core of processor is : ");
		return "i3";
	}

}
