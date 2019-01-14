package abstract_Factory_Design_Pattern;

import java.util.Scanner;

public class FruitMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);		
		System.out.println("Enter your fruit type :(Mango/apple):");
		String str=sc.nextLine();
		FruitClass f=null;
		if("Mango".equalsIgnoreCase(str))
		{
			 f=FruitFactory.getFruit(new MangoFactory(2000.0,"Alphonso"));
		}
		if("Pineapple".equalsIgnoreCase(str))
		{
			f=FruitFactory.getFruit(new PineappleFactory(500.00,"Pineapple"));
		}
		double price=f.getPrice();
		String type=f.getType();
		System.out.println("Furit Name:"+type+"\n"+"Fruit Price:"+price);
	}

}
