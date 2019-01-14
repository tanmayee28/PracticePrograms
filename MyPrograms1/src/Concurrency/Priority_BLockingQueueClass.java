package Concurrency;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class Priority_BLockingQueueClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BlockingQueue<Student>bq1=new PriorityBlockingQueue<Student>();
		ProducerPQ pq=new ProducerPQ("Producer", bq1);
		ConsumerPQ cq=new ConsumerPQ("Consumer",bq1);
		pq.start();
		cq.start();
		
	}

}
class ProducerPQ extends Thread
{
	String str;
	BlockingQueue bq=null;
	public ProducerPQ(String str, BlockingQueue bq) {
		super(str);
		this.bq = bq;
	}
	public void run()
	{
		
		Student s1=new Student(32,"Tanmayee");
		Student s2=new Student(10,"Neha");
		Student s3=new Student(5,"Sudhir");
		Student s4=new Student(2,"sunil");
		Student s5=new Student(22,"Swati");
		
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
class ConsumerPQ extends Thread
{
	String str;
	BlockingQueue bq=null;
	public ConsumerPQ(String str, BlockingQueue bq) {
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
class Student implements Comparable<Student>
{
	int studentId;
	String studentName;
	
	
	public Student(int studentId, String studentName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
	}
	

	public int getStudentId() {
		return studentId;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + "]";
	}


	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.studentId-o.studentId;
	}
	
}