package builderDesignPattern;

public class Computer {

	
   //manadatory fields
	private int hdd;
	private String name;
	private int ram;
	
	//optional fields
	
	private boolean isbluetooth;
	private boolean iswifi;
	
	
	
	private Computer(ComputerBuilder builder) {
		super();
		this.hdd = builder.hdd;
		this.name =builder.name;
		this.ram = builder.ram;
		this.isbluetooth = builder.isbluetooth;
		this.iswifi = builder.iswifi;
	}
	private boolean isIsbluetooth() {
		return isbluetooth;
	}
	private boolean isIswifi() {
		return iswifi;
	}
	
	public static class ComputerBuilder
	{
		//manadatory fields
		private int hdd;
		private String name;
		private int ram;
		
		//optional fields
		
		private boolean isbluetooth;
		private boolean iswifi;
		public ComputerBuilder(int hdd, String name, int ram) {
			super();
			this.hdd = hdd;
			this.name = name;
			this.ram = ram;
		}
		public ComputerBuilder isIsbluetooth(boolean isbluetooth) {
			this.isbluetooth=isbluetooth;
			return this;
		}
		public ComputerBuilder isIswifi(boolean iswifi) {
			this.iswifi=iswifi;
			return this;
		}
		public Computer build()
		{
			return new Computer(this);
		}
		
	}

	@Override
	public String toString() {
		return "Computer [hdd=" + hdd + ", name=" + name + ", ram=" + ram + ", isbluetooth=" + isbluetooth + ", iswifi="
				+ iswifi + "]";
	}
	
	
}
