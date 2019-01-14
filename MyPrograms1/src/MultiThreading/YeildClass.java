package MultiThreading;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class YeildClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 BlockingQueue q=new ArrayBlockingQueue(2);
		 Producer o=new Producer("producer",q);
		 Consumer p=new Consumer("Consumer",q);
		 o.start();
		 p.start();
		 
		 try {
			 System.out.println("main working 1");
			 
			Thread.sleep(1000);
			
			Thread.yield(); //main thread yeilded
			System.out.println("main working 2");
		 } catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 System.out.println(Thread.currentThread().getName()+" is completed");

	}

}
class Producer extends Thread
{
	String str;
	BlockingQueue q=null;
	public Producer(String str, BlockingQueue q) {
		super(str);
		this.q = q;
	}
	public  void run()
	{
		
		
		int i=0;
		synchronized (q) {
			while(i<4)
			{
				try {
					Thread.sleep(500);
					System.out.println(Thread.currentThread().getName()+" is in run method");
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				i++;
			}
			
		}
		
	}
}
class Consumer extends Thread
{
	String str;
	BlockingQueue q=null;
	public Consumer(String str, BlockingQueue q) {
		super(str);
		this.q = q;
	}
	public void run()
	{
		int i=0;
		synchronized(q)
		{
			while(i<4)
			{
				try {
					Thread.sleep(500);
					System.out.println(Thread.currentThread().getName()+" is in run method..");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				i++;
			}
		}
	}
	
}