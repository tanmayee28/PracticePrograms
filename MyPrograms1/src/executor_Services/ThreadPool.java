package executor_Services;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPool {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		
		ThreadPoolExecutor threadpool = (ThreadPoolExecutor) Executors.newCachedThreadPool();	
		
		
		Future<String> f =threadpool.submit(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
			Thread.interrupted();	
			System.out.println("hey");
			}
		}, "ninad")	;	
		
		System.out.println("hi you are the best "+f.get());
		
		
		//System.out.println(threadpool.getActiveCount());
		System.out.println(threadpool.getPoolSize());
		
		threadpool.execute(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("hi");
				
			}
		});
		
		System.out.println(threadpool.getPoolSize());
		//System.out.println(threadpool.getActiveCount());
   for(int i = 0; i<=10;i++) {
		threadpool.execute(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("hi 2");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
   }
        Thread.sleep(10000);
		//System.out.println(threadpool.getActiveCount());
    	System.out.println(threadpool.getPoolSize());
		
	}
	
}
