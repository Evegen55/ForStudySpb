/**
 * 
 */
package _java._7_0._07_Multithreading._concurrent._executors;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author Lartsev
 *
 */
public class CallableSolution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ExecutorService ex = Executors.newCachedThreadPool();
		Future<Integer> s = ex.submit(new CallableThread());
		Future<Integer> s1 = ex.submit(new CallableThread());
		
		try {
			System.out.println("I'm here");
			System.out.println(s.isDone());
			System.out.println(s.get());
			System.out.println(s1.get());
			System.out.println(s1.isDone());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
