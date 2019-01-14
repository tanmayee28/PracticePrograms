package MultiThreading;

public class SimpleThreadClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadClass thr=new ThreadClass("ThreadClass ");
		System.out.println(thr.getName()+" is created");
		System.out.println(thr.getName()+ "is in runnable state");
		thr.start();
		System.out.println(Thread.currentThread().getName()+" performing");

	}
}
class ThreadClass extends Thread
{
	String str;
	
	
	public ThreadClass(String str) {
		super(str);
	}


	public void run()
	{
		System.out.println(Thread.currentThread().getName()+ " is in running state.. ");
		System.out.println(Thread.currentThread().getName()+" performing the task");
	}
}