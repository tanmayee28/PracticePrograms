package MultiThreading;

public class SimplejoinThread {
	public static void main(String []args) throws InterruptedException
	{
		Thread1 thr=new Thread1("NewThread");
		thr.start();
		thr.join();
		System.out.println(Thread.currentThread().getName()+" is performing");
	}

}
class Thread1 extends Thread
{
	String str;

	public Thread1(String str) {
		super(str);
		
	}
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" is perfroming");
		}

	}
}