package MultiThreading;

public class ThreadJoin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		JoinThread j1=new JoinThread("Thread 1");
		JoinThread j2=new JoinThread("Thread 2");
		JoinThread j3=new JoinThread("Thread 3");
		j1.start();
		j1.join();
		
		j2.start();
		j2.join();
		
		j3.start();
		j3.join();
		
		System.out.println(Thread.currentThread().getName()+ " completed");
	}

}
class JoinThread extends Thread
{
	String str;

	public JoinThread(String str) {
		super(str);	
	}
	public void run()
	{
		for(int i=0;i<3;i++)
		{
			System.out.println(Thread.currentThread().getName()+" is performing for :"+i +"th time");
		}
	
	}
	
	
}