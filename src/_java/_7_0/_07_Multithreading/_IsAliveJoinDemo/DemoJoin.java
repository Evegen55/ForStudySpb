/**
 * 
 */
package _java._7_0._07_Multithreading._IsAliveJoinDemo;

/**
 * @author Lartsev
 *
 */
public class DemoJoin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		NewThread ob1 = new NewThread("one");
		NewThread ob2 = new NewThread("two");
		NewThread ob3 = new NewThread("three");
		
		System.out.println("Thread one is alive" + "\t" + ob1.t.isAlive());
		System.out.println("Thread two is alive" + "\t" + ob2.t.isAlive());
		System.out.println("Thread three is alive" + "\t" + ob3.t.isAlive());
		
		try {
			System.out.println("Waiting for threads to finish");
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
		} catch (InterruptedException e) {
			System.out.println("Main thread interrupted");
			e.printStackTrace();
		}
		
		System.out.println("Thread one is alive" + "\t" + ob1.t.isAlive());
		System.out.println("Thread two is alive" + "\t" + ob2.t.isAlive());
		System.out.println("Thread three is alive" + "\t" + ob3.t.isAlive());

	}

}
