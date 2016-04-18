/**
 * 
 */
package _java._se._07_Multithreading._concurrent._lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Lartsev
 *
 */
public class LockDemo implements Runnable {
	public static int count;
	private static Lock lock = new ReentrantLock();
	
	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		for (int i = 0; i < 1000000; i++ ) {
			lock.lock();
			count++;
			lock.unlock();
		}
		System.out.println("I'm here" + "\t" + count);

	}
	
	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		LockDemo l1 = new LockDemo();
		LockDemo l2 = new LockDemo();
		
		Thread th1 = new Thread(l1);
		Thread th2 = new Thread(l2);
		
		th1.start();
		th2.start();
		
	}

}
