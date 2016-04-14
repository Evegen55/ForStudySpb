/**
 * 
 */
package _java._se._07_Multithreading;

/**
 * @author Lartsev
 *
 */
public class GetStateDemo implements Runnable {

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		Thread.State state = Thread.currentThread().getState();
		System.out.println(Thread.currentThread().getName() + "\t" + 
							"state inside object"  + "\t" +  state);

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread th1 = new Thread(new GetStateDemo());
		th1.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Thread.State state = th1.getState();
		System.out.println(th1.getName() + "\t" + 
							"state outside object"  + "\t" +  state);

	}

}
