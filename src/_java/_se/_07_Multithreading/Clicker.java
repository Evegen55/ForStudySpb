/**
 *
 */
package _java._se._07_Multithreading;

/**
 * @author Lartsev
 *
 */
public class Clicker extends Thread {
	int click = 0;
	private volatile boolean running = true;
	/**
	 *
	 */
	public Clicker() {
	}
	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		while (running) {
			click++;
		}
	}

	public void stopClick() {
		running = false;
	}


}
