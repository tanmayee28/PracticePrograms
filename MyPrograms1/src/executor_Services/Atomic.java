package executor_Services;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;

public class Atomic {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Future f = null;
		ThreadPoolExecutor threadpool = (ThreadPoolExecutor) Executors.newCachedThreadPool();
		ExecutorService threadpool2 =  Executors.newSingleThreadExecutor();
		for(int x = 0;x<10;x++) {
		f =threadpool2.submit(new Mytask((1)));
		//System.out.println(+x+" Result "+f.get());
		
		}
		/*
		for(int y=0;y<10;y++) {
		Thread.sleep(1000);
		System.out.println(y);
		}*/
		System.out.println("Result "+f.get());
		
		
	}
}


class Mytask implements Callable <Integer> {

	public int myval;
	public static AtomicInteger atomic =new AtomicInteger(0);
	public static int a=0;
	public Mytask(int myval) {
		super();
		this.myval = myval;
	}


	@Override
	public Integer call() throws Exception {		
		
		
		//int i =atomic.addAndGet(myval);
		for(int i = 0 ; i<=50; i++) {
	     a = a+myval;
		}
		return a;
	}
	
}
