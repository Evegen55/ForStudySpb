/**
 * 
 */
package _java._7_0._07_Multithreading._exceptions;

/**
 * @author Lartsev
 *
 */
public class ThreadUncaughtExceptionDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread t = new Thread(new SimpleThread());
		t.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
			
			@Override
			public void uncaughtException(Thread t, Throwable e) {
				System.out.println(t + "throws exception: " + e);
				
			}
		});
		
		t.start();

	}

}
