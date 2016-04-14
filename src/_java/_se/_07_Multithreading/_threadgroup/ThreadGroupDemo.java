/**
 * 
 */
package _java._se._07_Multithreading._threadgroup;

/**
 * @author Lartsev
 *
 */
public class ThreadGroupDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ThreadGroup groupA = new ThreadGroup("Group A");
		ThreadGroup groupB = new ThreadGroup("Group B");
		
		MyThread ob1 = new MyThread("one", groupA);
		MyThread ob3 = new MyThread("two", groupB);
		MyThread ob4 = new MyThread("three", groupA);
		MyThread ob5 = new MyThread("four", groupB);
		MyThread ob6 = new MyThread("five", groupA);
		MyThread ob7 = new MyThread("six", groupB);
		
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			System.out.println("Exception in:");
			e.printStackTrace();
		}
		
		groupA.interrupt();

	}

}
