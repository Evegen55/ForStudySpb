/**
 * 
 */
package _java._7_0._07_Multithreading._suspend;

/**
 * @author Lartsev
 *
 */
public class SuspendResumeDemo {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		ConsoleClock clock = new ConsoleClock();
		clock.start();
		
		Thread.sleep(3000);
		
		clock.suspend();
		
		Thread.sleep(3000);
		
		clock.resume();

	}

}
