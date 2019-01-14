import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CountDownLatchClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountDownLatch counter=new CountDownLatch(3);
		
		SServices services=new SServices(counter,"Security_Service");
		Thread thread1=new Thread(services);
		
		SServices services1=new SServices(counter,"Login_Service");
		Thread thread2=new Thread(services);
		
		SServices services2=new SServices(counter,"Validation_Service");
		Thread thread3=new Thread(services);
		
		thread1.start();
		thread2.start();
		thread3.start();
		
		try {
			
			counter.await();
			System.out.println("Application is all up to perform..");
		}catch(Exception e)
		{}
	}

}
class SServices implements Runnable
{
	CountDownLatch counter;
	String str;
	
	public SServices(CountDownLatch counter, String str) {
		this.counter = counter;
		this.str = str;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(1000);
			System.out.println(Thread.currentThread().getName()+ " is up ");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		counter.countDown();
	}
	
}
/*class Services implements Delayed
{
	int serviceId;
	long stattime;
	
	public Services(int serviceId, long delay) {
		super();
		this.serviceId = serviceId;
		this.stattime = System.currentTimeMillis()+delay;
	}

	@Override
	public int compareTo(Delayed o) {
		// TODO Auto-generated method stub
		return this.serviceId-((Services)o).serviceId;
	}

	@Override
	public long getDelay(TimeUnit unit) {
		// TODO Auto-generated method stub
		long diff=stattime-System.currentTimeMillis();
		return unit.convert(diff,TimeUnit.MILLISECONDS);
	}

	@Override
	public String toString() {
		return "Services [serviceId=" + serviceId + ", stattime=" + stattime + "]";
	}
	
	
}*/