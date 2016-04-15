/**
 * 
 */
package _java._se._07_Multithreading._exceptions;

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
