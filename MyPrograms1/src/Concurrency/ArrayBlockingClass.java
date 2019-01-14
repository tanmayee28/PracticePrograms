package Concurrency;


import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class ArrayBlockingClass {
	public static void main(String []args) {
		BlockingQueue<Integer>bq=new ArrayBlockingQueue<>(5);
		ProducerAB o=new ProducerAB("Producer",bq);
		ConsumerAB c =new ConsumerAB("Consumer",bq);
		o.start();
		c.start();
	}

}
class ProducerAB extends Thread
{
	String str;
	
	BlockingQueue bq=null;
	public ProducerAB(String str, BlockingQueue bq) {
		super(str);
		
		this.bq = bq;
	}
	public void run()
	{
		while(true)
		{
			int no=ThreadLocalRandom.current().nextInt(1,20);
			System.out.println(Thread.currentThread().getName()+" is producing :"+no);
			 try {
				 Thread.sleep(1000);
				bq.offer(no);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
class ConsumerAB extends Thread
{
	String str;
	
	BlockingQueue bq=null;
	public ConsumerAB(String str, BlockingQueue bq) {
		super(str);
		
		this.bq = bq;
	}
	public void run()
	{	
		while(true)
		{
			try {
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName()+" consuming :"+bq.poll());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}