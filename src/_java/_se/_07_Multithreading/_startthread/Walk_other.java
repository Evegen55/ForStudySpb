/**
 * 
 */
package _java._se._07_Multithreading._startthread;

/**
 * @author Lartsev
 *
 */
public class Walk_other implements Runnable {

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		for (int i = 0; i < 8; i++) {
			System.out.println("\t" + "Walking-----");
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
