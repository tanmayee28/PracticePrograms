package builderDesignPattern;

public class ComputerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer comp=new Computer.ComputerBuilder(500,"Compaq",4).isIsbluetooth(true).isIswifi(true).build();
		System.out.println(comp);
	}

}
