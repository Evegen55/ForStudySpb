/**
 * 
 */
package _java._7_0._07_Multithreading._startthread;

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
		talk.start();
		System.out.println("===================");
		walk.start();
		
		//execute method with no create a new thread
		System.out.println("===================");
		Walk_other w = new Walk_other();
		w.run();

	}

}
