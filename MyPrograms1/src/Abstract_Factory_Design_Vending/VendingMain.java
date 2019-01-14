package Abstract_Factory_Design_Vending;

import java.util.Scanner;

public class VendingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("Plz enter your option : ");
			System.out.println("1)Water 2)EnergyBar 3)FoodPackage  ");
			String str=sc.next();
			switch(str)
			{
			case "water":
							VendingInterface w=new Water();
							w.selectCoin();
							
			case "EnergyBar":
							
							VendingInterface eb =new EnergyBar();
							eb.selectCoin();
							
			case "FoodPackage":
							
							VendingInterface fp =new FoodPackage();
							fp.selectCoin();
				
			case "exit":
							System.out.println("Come Back Sooon.....");
							System.exit(0);
							
							
			
			}
			
		}
		
		
	}

}
