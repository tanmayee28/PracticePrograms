package MultiThreading;

public class DeadLockTesting {

	static Thread t1;
	static Thread t2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		  String str1="JAVA";
		 String str2="UNIX";
		 t1=new Thread("Thread1") {
			public void run()
			{
				while(true)
				{
				synchronized(str1)
				{
					
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					synchronized(str2)
					{
						
						System.out.println(str2+str1);
					}
				}
			}
			}
		};
		
	 t2=new Thread("Thread 2") {
			public void run()
			{
				while(true)
				{
					synchronized(str2)
					{
						try {
							Thread.sleep(5000);
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						synchronized(str1)
						{
							
							System.out.println(str1+str2);
							
						}
					}
						}
			}
		};
		
		
		DeadLockTesting ob=new DeadLockTesting();
		t1.start();
		t2.start();
		
		System.out.println("Main method is completed");
		System.out.println("Thread-1 :"+t1.getState()+"  IsAlive:"+t1.isAlive());
		System.out.println("Thread-2 :"+t2.getState()+"  IsAlive:"+t1.isAlive());
		
}	
}
