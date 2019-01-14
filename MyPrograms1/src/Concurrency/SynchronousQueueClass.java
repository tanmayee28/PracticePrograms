package Concurrency;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadLocalRandom;

public class SynchronousQueueClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BlockingQueue bq=new SynchronousQueue<>();
		ProducerSQ psq=new ProducerSQ("Producer",bq);
		ConsumerSQ csq=new ConsumerSQ("Consumer",bq);
		psq.start();
		csq.start();
	}

}
class ProducerSQ extends Thread
{
	String str;
	BlockingQueue bq=null;
	public ProducerSQ(String str,BlockingQueue bq) {
		super(str);
		this.bq=bq;
	}
	public void run()
	{
		while(true)
		{
			try {
					int no=ThreadLocalRandom.current().nextInt(1,25);
					Thread.sleep(1000);
					System.out.println(Thread.currentThread().getName()+" producing :"+no);
					bq.put(no);
			}catch(Exception e){
				
			}
		}
	}
	
}
class ConsumerSQ extends Thread
{
	String str;
	BlockingQueue bq=null;
	public ConsumerSQ(String str,BlockingQueue bq ) {
		super(str);
		this.bq=bq;
	}
	public void run()
	{
		while(true)
		{
			try {
					System.out.println(Thread.currentThread().getName()+" consuming :"+bq.take());
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
	
}