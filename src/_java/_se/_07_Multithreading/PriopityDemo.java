/**
 * 
 */
package _java._se._07_Multithreading;

/**
 * @author Lartsev
 *
 */
public class PriopityDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		Clicker hi = new Clicker();
		Clicker lo = new Clicker();
		
		hi.setPriority(Thread.NORM_PRIORITY + 2);
		lo.setPriority(Thread.NORM_PRIORITY - 2);
		
		lo.start();
		hi.start();
		
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		lo.stopClick();
		hi.stopClick();
		
		try {
			hi.join();
			lo.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("low-priority thread:" + lo.click);
		System.out.println("hi-priority thread:" + hi.click);

	}

}
