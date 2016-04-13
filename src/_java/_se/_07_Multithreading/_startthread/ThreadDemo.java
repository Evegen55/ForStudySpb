/**
 * 
 */
package _java._se._07_Multithreading._startthread;

/**
 * @author Lartsev
 *
 */
public class ThreadDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//create new thread objects
		Talk talk = new Talk();
		Thread walk = new Thread(new Walk());
		//start threads
		talk.run();
		System.out.println("===================");
		walk.run();
		
		//execute method with no create a new thread
		System.out.println("===================");
		Walk w = new Walk();
		w.run();

	}

}
