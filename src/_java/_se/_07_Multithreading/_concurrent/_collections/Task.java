/**
 * 
 */
package _java._se._07_Multithreading._concurrent._collections;

import java.util.Random;

/**
 * @author Lartsev
 *
 */
public class Task implements Comparable<Task> {
	
	private int taskNumber;
	
	
	/**
	 * @param taskNumber
	 */
	public Task(int taskNumber) {
		this.taskNumber = taskNumber;
	}


	/**
	 * @return the taskNumber
	 */
	public int getTaskNumber() {
		return taskNumber;
	}


	/**
	 * @param taskNumber the taskNumber to set
	 */
	public void setTaskNumber(int taskNumber) {
		this.taskNumber = taskNumber;
	}


	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Task o) {
		Random rand = new Random();
		int comp = rand.nextInt(2000);
		if (comp % 2 == 0) return 1;
		if (comp % 3 == 0) return -1;
		else return 0;
	}


}
