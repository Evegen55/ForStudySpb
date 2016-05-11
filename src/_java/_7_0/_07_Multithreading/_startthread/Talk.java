/**
 * 
 */
package _java._7_0._07_Multithreading._startthread;

/**
 * @author Lartsev
 *
 */
public class Talk extends Thread {

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		for (int i = 0; i < 8; i++) {
			System.out.println("Talking");
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
