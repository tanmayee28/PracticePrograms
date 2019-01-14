package Concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Cuncurrency_Class {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub

		ExecutorService ex=Executors.newFixedThreadPool(5);
		//ExecutorService ex1=Executors.newScheduledThreadPool(5);
		ExecutorService ex1=Executors.newSingleThreadScheduledExecutor();
		
		Callable cal=new Callable() {

			@Override
			public Integer call() throws Exception {
				// TODO Auto-generated method stub
				return new Integer(10);
			}
			
		};
		Future<Integer>f=ex1.submit(cal);
		System.out.println(f.get());
		//ex1=Executors.newCachedThreadPool();*/
		
		
	}

}
