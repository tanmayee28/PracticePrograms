package CutomizedException;

import java.util.Scanner;

public class TooYoung_Old_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int age=0;
		System.out.println("Enter your age :");
		age=sc.nextInt();
		if(age <10)
		{
			try {
				throw new TooYoungException("You are too old to have girlfriend..");
			} catch (TooYoungException e) {
				// TODO Auto-generated catch block
				System.out.println("You should stop looking for girlfriends..(Sarcasm)");
				e.printStackTrace();
			}
		}else if(age>60){
				try {
						throw new TooOldException("You are too young to have girfriend");
					} catch (TooOldException e) {
					// TODO Auto-generated catch block
						System.out.println("You should wait for girlfriends..(Sarcasm)");
					e.printStackTrace();
					}
				}else
				{
					System.out.println("You can have girlfrined..");
				}
		
		

	}

}
class TooYoungException extends Exception 
{
	String str;

	public TooYoungException(String str) {
		super();
		this.str = str;
	}
	
}

class TooOldException extends Exception
{
	String str;

	public TooOldException(String str) {
		super();
		this.str = str;
	}
	
}