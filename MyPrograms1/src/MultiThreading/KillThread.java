package MultiThreading;

import java.util.concurrent.ThreadFactory;

public class KillThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo1 td=new ThreadDemo1("Thread1");
		td.start();

	}	
}
class ThreadDemo1 extends Thread
{
	String str;
	volatile  boolean flg=true;
	public ThreadDemo1(String str) {
		super(str);
	}
	public  void killThread()
	{
		System.out.println(Thread.currentThread().getName()+" is killed");
		flg=false;
	}
	public void run()
	{
		while(flg)
		{
			for(int i=0;i<5;i++)
			{
				System.out.println(Thread.currentThread().getName()+" consuming :"+i);
			}
			if(Thread.currentThread().getName().equals("Thread1"))
			{
				System.out.println("I am about to die");
				killThread();
			}
		}
			
	}
}