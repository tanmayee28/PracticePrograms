package MultiThreading;

public class InteruptionwithoutHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Geek g1=new Geek("Geek");
		g1.start();
		try {
			g1.interrupt();
		}catch(Exception e)
		{
			System.out.println("Handled in main only");
		}
		
	}

}
class Geek extends Thread
{
	String str;
	
	public Geek(String str) {
		super(str);
		
	}

	public void run()
	{
		for(int i=0;i<3;i++)
		{
			System.out.println("I am lazy thread i want to sleep..");
		}
		System.out.println("I want to sleep..");
	
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println(" I got interrupted..:-(5t");
				e.printStackTrace();
			}
		
		
	}
}