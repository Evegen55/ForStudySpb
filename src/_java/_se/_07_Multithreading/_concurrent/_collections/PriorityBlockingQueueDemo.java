/**
 * 
 */
package _java._se._07_Multithreading._concurrent._collections;

/**
 * @author Lartsev
 *
 */
public class PriorityBlockingQueueDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		QueueTask pbQueue = new QueueTask();
		for (int i = 0; i < 10; i++ ) {
			pbQueue.setTask(new Task(i));
		}
		
		Manager man1 = new Manager(pbQueue, "John");
		Manager man2 = new Manager(pbQueue, "Doe");
		
		Thread th1 = new Thread(man1);
		Thread th2 = new Thread(man2);
		
		th1.start();
		th2.start();
		
		try {
			th1.join();
			th2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
