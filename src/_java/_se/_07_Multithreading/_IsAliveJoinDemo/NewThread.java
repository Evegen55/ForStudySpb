/**
 * 
 */
package _java._se._07_Multithreading._IsAliveJoinDemo;

/**
 * @author Lartsev
 *
 */
public class NewThread implements Runnable {

	String name;
	Thread t;
	
	
	/**
	 * @param name
	 */
	public NewThread(String name) {
		this.name = name;
		t = new Thread(this, name);
		System.out.println("new thread" + "\t" + t);
		t.start();
	}


	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println(name + "\t" + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println(name + "\t" + "interrupted");
			e.printStackTrace();
		}
		System.out.println(name + "\t" + "exiting");

	}

}
