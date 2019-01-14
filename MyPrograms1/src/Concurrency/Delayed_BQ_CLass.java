package Concurrency;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class Delayed_BQ_CLass {
	public static void main(String []args)
	{
		BlockingQueue<StudentDQ>bq=new DelayQueue();
		ProducerDQ pdq=new ProducerDQ("Producer", bq);
		ConsumerDQ cdq=new ConsumerDQ("Consumer", bq);
		pdq.start();
		cdq.start();
	}

}
class ProducerDQ extends Thread
{
	String str;
	BlockingQueue bq=null;
	public ProducerDQ(String str, BlockingQueue bq) {
		super(str);
		this.bq = bq;
	}
	public void run()
	{
		int i=1;
		while(true)
		{				
				try{
						Thread.sleep(1000);
						StudentDQ s1=new StudentDQ(1,"tanu"+i,2000);
						System.out.println(Thread.currentThread().getName()+ " producing :"+s1);
						bq.put(s1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			i++;
		}
	}
	
}
class ConsumerDQ extends Thread
{
	String str;
	BlockingQueue bq=null;
	public ConsumerDQ(String str, BlockingQueue bq) {
		super(str);
		this.bq = bq;
	}
	public void run()
	{
		while(true)
		{
			for(int i=0;i<5;i++)
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
	
}
class StudentDQ implements Delayed
{
	int sid;
	String snm;
	long starttime;
	
	public StudentDQ(int sid, String snm, long delay) {
		super();
		this.sid = sid;
		this.snm = snm;
		this.starttime = System.currentTimeMillis()+delay;
	}
	
	@Override
	public String toString() {
		return "StudentDQ [sid=" + sid + ", snm=" + snm + ", starttime=" + starttime + "]";
	}
	                                                                                   
	@Override
	public int compareTo(Delayed o) {
		// TODO Auto-generated method stub
		return (int) (this.starttime-((StudentDQ)o).starttime) ;
	}

	@Override
	public long getDelay(TimeUnit unit) {
		// TODO Auto-generated method stub
		long diff=starttime-System.currentTimeMillis();
		return unit.convert(diff,TimeUnit.MILLISECONDS);
	}
	
}