package MultiThreading;

public class InterruptClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo thread=new ThreadDemo("ThreadDemo");
		thread.start();
		System.out.println(Thread.currentThread().getName()+" is interrupting Threaddemo Class :");
		thread.interrupt();
	}

}
class ThreadDemo extends Thread
{
	String str;

	public ThreadDemo(String str) {
		super(str);
		
	}
	public void run()
	{
		
		System.out.println(Thread.currentThread().getName()+" is performing");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("OOps i got interrupted");
			e.printStackTrace();
		}
		
	}
	
}