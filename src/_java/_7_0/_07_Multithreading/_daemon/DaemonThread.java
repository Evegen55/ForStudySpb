/**
 * 
 */
package _java._7_0._07_Multithreading._daemon;

/**
 * @author Lartsev
 *
 */
public class DaemonThread extends Thread {

	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		
			for (int i = 0; i < 10; i++) {
				System.out.println(i + " ");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		
	}

}
