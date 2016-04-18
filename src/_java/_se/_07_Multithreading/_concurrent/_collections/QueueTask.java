/**
 * 
 */
package _java._se._07_Multithreading._concurrent._collections;

import java.util.concurrent.PriorityBlockingQueue;

/**
 * @author Lartsev
 *
 */
public class QueueTask {
	private PriorityBlockingQueue<Task> queue= new PriorityBlockingQueue<>();
	
	public Task getTask() {
		return queue.poll();
	}
	
	public void setTask(Task task) {
		queue.add(task);
	}

	/**
	 * @return the queue
	 */
	public PriorityBlockingQueue<Task> getQueue() {
		return queue;
	}
	
	
	
}
