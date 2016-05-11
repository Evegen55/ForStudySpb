/**
 * 
 */
package _java._7_0._07_Multithreading._exceptions;

/**
 * @author Lartsev
 *
 */
public class SimpleThread implements Runnable {

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		throw new RuntimeException("================================");
	}

}
