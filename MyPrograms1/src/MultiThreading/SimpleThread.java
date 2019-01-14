package MultiThreading;

public class SimpleThread {
	
	public static void main(String args[])
	{
		SimpleThreadDemo s=new SimpleThreadDemo();
		Thread thr=new Thread(s);
		System.out.println(Thread.currentThread().getName()+" is created..");
		System.out.println(Thread.currentThread().getName()+" runnable stated");
		thr.start();
		System.out.println("M in main now");
	}

}
class SimpleThreadDemo implements Runnable
{

	public void run()
	{
		System.out.println(Thread.currentThread().getName()+ " is in running state.. ");
		System.out.println(Thread.currentThread().getName()+" performing the task");
	}
}