import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class Cyclic_BarrierImpl 
{
	public static void main(String[]args) throws InterruptedException
	{
		Barrier1 bar=new Barrier1();
		CyclicBarrier cbr=new CyclicBarrier(6,new Runnable() {
			
			@Override
			public void run() {
				System.out.println("this executes after last party arrives..");
				
			}
		}); 
		
		ThreadsImpl t1=new ThreadsImpl("Thread1",cbr);
		ThreadsImpl t2=new ThreadsImpl("Thread2", cbr);
		ThreadsImpl t3=new ThreadsImpl("Thread3", cbr);
		ThreadsImpl t4=new ThreadsImpl("Thread4", cbr);
		ThreadsImpl t5=new ThreadsImpl("Thread5", cbr);
		ThreadsImpl t6=new ThreadsImpl("Thread6",cbr);
		ThreadsImpl t7=new ThreadsImpl("Thread7", cbr);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		Thread.sleep(2000);
	//	t4.interrupt();
		
		System.out.println("from main is bar broken before reset ?"+cbr.isBroken());
		cbr.reset();
		Thread.sleep(2000);
		System.out.println("from main is bar broken ?"+cbr.isBroken());
		t6.start();
		t7.start();
		
	}
	
}
class Barrier1 implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+" Waiting for other threads..Barrier 1..");
	}
	
}
class ThreadsImpl extends Thread
{
	String str;
	CyclicBarrier cb;

	
	public ThreadsImpl(String str, CyclicBarrier cb) {
		super(str);
		this.str = str;
		this.cb = cb;
	}


	public void run()
	{
		System.out.println(Thread.currentThread().getName()+" reached at barrier");
		System.out.println(cb.isBroken());
		try {
			/*Thread.sleep(2000);
			cb.await(8000,TimeUnit.MILLISECONDS);*/
			cb.await();
			System.out.println("after barrier tripped..");
		} catch (InterruptedException | BrokenBarrierException e) {
			
			System.out.println("Barrier broken....");
			e.printStackTrace();
		}
		/*} catch (TimeoutException e) {
			System.out.println("TIMROUT....");
			e.printStackTrace();
		}*/
	}
}