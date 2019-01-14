package opps;

public class VolitileClass {
	
	static volatile int ab=2;
	public static void main(String[] args) {
		Thread t1=new Thread(new Runnable()
				{

					@Override
					public void run() {
						// TODO Auto-generated method stub
						while(ab<=20)
						{
						ab+=2;
						System.out.println("ab1 :"+ab);
					}
					}
			
				});
		

		Thread t2=new Thread(new Runnable()
				{

					@Override
					public void run() {
						// TODO Auto-generated method stub
						while(ab<=20)
						{
							ab+=2;
							System.out.println("ab2 :"+ab);
						}
					}
			
				});
		
		
		t1.start();
		t2.start();
	}

}
