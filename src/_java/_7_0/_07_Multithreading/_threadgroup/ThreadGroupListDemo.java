/**
 * 
 */
package _java._7_0._07_Multithreading._threadgroup;

/**
 * @author Lartsev
 *
 */
public class ThreadGroupListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ThreadGroup mainGroup = new ThreadGroup("Group Main");
		ThreadGroup groupA = new ThreadGroup(mainGroup, "Group A");
		ThreadGroup groupB = new ThreadGroup(mainGroup, "Group B");
		
		MyThread ob1 = new MyThread("one", groupA);
		MyThread ob3 = new MyThread("two", groupB);
		MyThread ob4 = new MyThread("three", groupA);
		MyThread ob5 = new MyThread("four", groupB);
		MyThread ob6 = new MyThread("five", groupA);
		MyThread ob7 = new MyThread("six", groupB);
		
		groupA.list();
		groupB.list();
		
		
		mainGroup.interrupt();
	}

}
