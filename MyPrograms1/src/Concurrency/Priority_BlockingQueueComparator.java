package Concurrency;

import java.util.Comparator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class Priority_BlockingQueueComparator {
	public static void main(String[]args)
	{
		BlockingQueue<Studentcom>bq1=new PriorityBlockingQueue<Studentcom>(5,new CompareByName());
		ProducerComparable pq=new ProducerComparable("Producer", bq1);
		ConsumerComparable cq=new ConsumerComparable("Consumer",bq1);
		pq.start();
		cq.start();
	}
}
class ProducerComparable extends Thread
{
	String str;
	BlockingQueue bq=null;
	public ProducerComparable(String str, BlockingQueue bq) {
		super(str);
		this.bq = bq;
	}
	public void run()
	{
		Studentcom s1=new Studentcom(32,"Tanmayee");
		Studentcom s2=new Studentcom(10,"Neha");
		Studentcom s3=new Studentcom(5,"Sudhir");
		Studentcom s4=new Studentcom(2,"sunil");
		Studentcom s5=new Studentcom(22,"Swati");
		
		try {
			
			System.out.println(Thread.currentThread().getName()+" is performing");
			bq.put(s1);
			bq.put(s2);
			bq.put(s3);
			bq.put(s4);
			bq.put(s5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" stopped");
	}
	
	
}
class ConsumerComparable extends Thread
{
	String str;
	BlockingQueue bq=null;
	public ConsumerComparable(String str, BlockingQueue bq) {
		super(str);
		this.bq = bq;
	}
	public void run()
	{
		for(int i=0;i<5;i++)
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
class Studentcom
{
	int studentId;
	String studentName;
	public Studentcom(int studentId, String studentName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
	}
	@Override
	public String toString() {
		return "Studentcom [studentId=" + studentId + ", studentName=" + studentName + "]";
	}
	
	
}
class CompareByName implements Comparator<Studentcom>
{

	
	public CompareByName() {
		super();
	}
	@Override
	public int compare(Studentcom o1, Studentcom o2) {
		// TODO Auto-generated method stub
		return o1.studentName.compareTo(o2.studentName);
	}
	
}