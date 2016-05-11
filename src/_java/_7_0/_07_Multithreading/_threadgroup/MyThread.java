/**
 * 
 */
package _java._7_0._07_Multithreading._threadgroup;

/**
 * @author Lartsev
 *
 */
public class MyThread extends Thread {

	public MyThread(String threadname, ThreadGroup tgOb) {
		super (tgOb, threadname);
		System.out.println("New thread" + this);
		start();
	}

	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		for (int i = 5; i >0; i--) {
			System.out.println("getName:" + getName() + "\t" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Exception in:" + "\t" + getName());
				e.printStackTrace();
			}
			System.out.println("\n" + "getName:" + getName() + "\t" + "exiting");
		}
	}
	
	
}
