package Abstract_Factory_Design_Vending;

import java.util.Scanner;

public class EnergyBar implements VendingInterface{

	
	 Scanner sc=new Scanner(System.in);
	 
		public void selectCoin()
 {
			// TODO Auto-generated method stub
			
			while(true)
			{
				System.out.println("Enter Your Coin :1)Rs 5 2)Rs 10 3)Rs 20 4)Exit");
				 int a=sc.nextInt();
				
				switch(a)
				{
				case 1:
						System.out.println("Plzz Enter 1 more coin of Rs 5");
						break;
						
				case 2:
						System.out.println("1 Energy Bar.. ");
						break;
					
				case 3:
						System.out.println("2 Energy Bars..");
						break;
					
				case 4:
					
						System.out.println("Come Back Sooon.....");
						System.exit(0);
				
				}

			}
		}
}
