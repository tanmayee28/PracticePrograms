package MultiThreading;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Producer_consumer {
	public static void main(String []args) {
		BlockingQueue<Integer>bq=new ArrayBlockingQueue<>(1);
		Producer1 o=new Producer1("Producer",1,bq);
		Consumer1 c =new Consumer1("Consumer",1,bq);
		o.start();
		c.start();
	}

}
class Producer1 extends Thread
{
	String str;
	int size;
	BlockingQueue bq=null;
	public Producer1(String str, int size, BlockingQueue bq) {
		super(str);
		this.size = size;
		this.bq = bq;
	}
	public void run()
	{
		synchronized(bq) {
		while(true)
		{
			if(bq.size()==size)
			{
			try {
					Thread.sleep(1000);
					//System.out.println(Thread.currentThread().getName()+" can't consume as queue is full..");
					bq.wait();

				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			int no=ThreadLocalRandom.current().nextInt(1,20);
			System.out.println(Thread.currentThread().getName()+" produced :"+no);
			try {
				bq.put(no);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			bq.notify();
		}
		}
	}
	
}
class Consumer1 extends Thread
{
	String str;
	int size;
	BlockingQueue bq=null;
	public Consumer1(String str, int size, BlockingQueue bq) {
		super(str);
		this.size = size;
		this.bq = bq;
	}
	public void run()
	{
		synchronized(bq)
		{
		while(true)
		{
			if(bq.isEmpty())
			{
				try {
					Thread.sleep(1000);
					//System.out.println(Thread.currentThread().getName()+"can't consume as queue is empty");
					bq.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			try {
				System.out.println(Thread.currentThread().getName()+" consumed :"+bq.take());
				bq.notify();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	}
	
}