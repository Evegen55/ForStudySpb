/**
 * 
 */
package _java._7_0._07_Multithreading._exceptions;

/**
 * @author Lartsev
 *
 */
public class ThreadDefaultUncaughtExceptionDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
			
			@Override
			public void uncaughtException(Thread t, Throwable e) {
				System.out.println(t + "throws exception: " + e);
				
			}
		});

		
		Thread t1 = new Thread(new SimpleThread());
		Thread t2 = new Thread(new SimpleThread());
		
		t2.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
			
			@Override
			public void uncaughtException(Thread t, Throwable e) {
				System.out.println(t + "throws exception: " + e);
				
			}
		});
		
		t1.start();
		t2.start();
	}

}
