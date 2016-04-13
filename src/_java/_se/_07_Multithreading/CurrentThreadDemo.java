/**
 * 
 */
package _java._se._07_Multithreading;

/**
 * @author Lartsev
 *
 */
public class CurrentThreadDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println("current thread is: " + t);
		t.setName("my thread");
		System.out.println("current thread AFTER change name is: " + t);
		
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println(i);
				Thread.sleep(1000);
				System.out.println("current thread is: " + t);
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
