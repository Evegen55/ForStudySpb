/**
 * 
 */
package _java._7_0._07_Multithreading._daemon;

/**
 * @author Lartsev
 *
 */
public class DaemonInspector {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Start main thread");
		
		DaemonThread daemon = new DaemonThread();
		daemon.setDaemon(true);
		//daemon.setDaemon(false);
		daemon.start();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("End main thread");

	}

}
