package Concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TransferQueue;

public class Transfer_BQ_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedTransferQueue<String> lq=new LinkedTransferQueue<String>();
		ExecutorService executor=Executors.newFixedThreadPool(5);
		
		ProducerTransfer pt=new ProducerTransfer(lq);
		ConsumerTransfer ct=new ConsumerTransfer(lq);
		
		executor.execute(pt);
		executor.execute(ct);
		
		executor.shutdown();
	}

}
class ProducerTransfer implements Runnable
{
	LinkedTransferQueue tq;
	
	public ProducerTransfer( LinkedTransferQueue tq) {
		super();
		this.tq = tq;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i=0;
		while(i<5)
		{
			System.out.println("Producer is waiting for Consumer to consume..");
			System.out.println(tq.tryTransfer("A"+i));
			System.out.println("Producer has produced the item.."+"A"+i);
			i++;
		}
	}
	
}
class ConsumerTransfer implements Runnable
{
	LinkedTransferQueue tq=null;

	public ConsumerTransfer(LinkedTransferQueue tq) {
		super();
		this.tq = tq;
	}
	public void run() {
		// TODO Auto-generated method stub
		int i=0;
		while(i<5)
		{
			System.out.println("consumer is waiting for consuming");
			System.out.println("Consumer is consuming :"+tq.poll());
			i++;
		}
	}
	
	
}