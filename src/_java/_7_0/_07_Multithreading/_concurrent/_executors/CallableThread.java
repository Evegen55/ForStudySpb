package _java._7_0._07_Multithreading._concurrent._executors;

import java.util.concurrent.Callable;

public class CallableThread implements Callable<Integer>{
	public int count;
	
	@Override
	public Integer call() throws Exception {
		for (int i = 0; i < 1000000; i++ ) {
			count++;
		}
		Thread.sleep(10000);
		
		return count;
	}

}
