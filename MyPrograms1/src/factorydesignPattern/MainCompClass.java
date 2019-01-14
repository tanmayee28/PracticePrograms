package factorydesignPattern;

import java.util.Scanner;

public class MainCompClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your choice :(HP/Dell) ");
		String str=sc.nextLine();
		ComputerInterface computer=CompFactory.getComputer(str);
		//System.out.println(computer.getName()+"\n"+computer.getRAM()+"\n"+computer.getHardDisk()+"\n"+computer.getCore());
		System.out.println(computer);
		/*String name=computer.getName();
		int ram=computer.getRAM();
		int hd=computer.getHardDisk();
		String core=computer.getCore();
		System.out.println(name+"\n"+ram+"\n"+hd+"\n"+core);
		
		*/
;;	}

}
