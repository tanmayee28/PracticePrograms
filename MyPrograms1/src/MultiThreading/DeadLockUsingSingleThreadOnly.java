package MultiThreading;

public class DeadLockUsingSingleThreadOnly {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Performing Thread is :"+Thread.currentThread().getName());
		System.out.println("Now we are going to enter in deadlock.. ");
		Thread.currentThread().join();
		System.out.println("Now this statement wont executed ever..");
	}

}
