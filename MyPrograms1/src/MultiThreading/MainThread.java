package MultiThreading;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class MainThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Application Started..");
		System.out.println("Current Thread Name:"+Thread.currentThread().getName());
		System.out.println("Default Priority :"+Thread.currentThread().getPriority());
		System.out.println("Default Thread Id :"+Thread.currentThread().getId());
		Thread.currentThread().setName("Main Thread");
		System.out.println("Thread Name after modification :"+Thread.currentThread().getName());
		Thread t=Thread.currentThread();
		t.setPriority(10);
		System.out.println("After setting new Priority :"+t.getPriority());
	}

}
