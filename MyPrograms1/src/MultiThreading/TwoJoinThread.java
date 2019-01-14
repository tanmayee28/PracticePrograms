package MultiThreading;

public class TwoJoinThread {

	static Thread thread;
	static Thread_Join tj;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	tj=new Thread_Join();
	thread=new Thread(tj);
	
	thread.start();

	}

}
class Thread_Join implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Thread_Join1 tj1=new Thread_Join1("Thread_Join1");
		tj1.start();
		try {
			System.out.println("Thread_Join is calling join method on thread_join1");
			tj1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("thread join  completed");
	}
	
}
class Thread_Join1 extends Thread
{

	String str;
	
	public Thread_Join1(String str) {
		super(str);	
	}
	public Thread_Join1() {
		super();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			
			
			System.out.println(Thread.currentThread().getName()+ " is performing "+Thread.currentThread().getState());
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Thread.sleep(500);
			System.out.println( Thread.currentThread().getName()+" completed");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}