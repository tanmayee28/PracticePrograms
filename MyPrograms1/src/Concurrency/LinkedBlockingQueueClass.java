package Concurrency;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadLocalRandom;

public class LinkedBlockingQueueClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BlockingQueue<Integer>bq=new LinkedBlockingQueue<>(3);
		ProducerLQ pl=new ProducerLQ("ProducerLQ",bq);
		ConsumerLQ cl=new ConsumerLQ("ConsumerLQ",bq);
		pl.start();
		cl.start();
		System.out.println(Thread.currentThread().getName()+" is performing");
	}

}
class ProducerLQ extends Thread
{
	String str;
	BlockingQueue bq=null;
	public ProducerLQ(String str,BlockingQueue bq) {
		super(str);	
		this.bq=bq;
	}
	public void run()
	{
		int i=0;
		while(i<4)
		{
			try {
				int no=ThreadLocalRandom.current().nextInt(1,35);
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName()+" producting item:"+no);
				bq.put(no);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i++;
			
		}
	}
	
}
class ConsumerLQ extends Thread
{
	String str;
	BlockingQueue bq=null;
	public ConsumerLQ(String str,BlockingQueue bq) {
		super(str);
		this.bq=bq;
	}
	public void run()
	{
		int i=0;
		while(i<4)
		{
			try {
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName()+" consuming :"+bq.take());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}