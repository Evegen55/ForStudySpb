/**
 * 
 */
package _java._se._07_Multithreading._concurrent._collections;

/**
 * @author Lartsev
 *
 */
public class Manager implements Runnable {
	
	private QueueTask pbQ;
	private String name;
	
	
	/**
	 * @param pbQ
	 * @param name
	 */
	public Manager(QueueTask pbQ, String name) {
		this.pbQ = pbQ;
		this.name = name;
	}



	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		Task task;
		while ((task = pbQ.getTask()) != null) {
			System.out.println(name + " get task number " + task.getTaskNumber());
		}

	}

}
