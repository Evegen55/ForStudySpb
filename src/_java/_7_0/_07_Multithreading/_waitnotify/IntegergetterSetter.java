/**
 * 
 */
package _java._7_0._07_Multithreading._waitnotify;

import java.util.Random;

/**
 * @author Lartsev
 *
 */
public class IntegergetterSetter extends Thread {
	private SharedResource resource;
	private boolean run;
	private Random rand = new Random();
	/**
	 * @param resource
	 */
	public IntegergetterSetter(String name, SharedResource resource) {
		super(name);
		this.resource = resource;
		run = true;
	}
	
	/**
	 * 
	 */
	public void stopThread() {
		run = false;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		int action;
		
		while(run) {
			action = rand.nextInt(1000);
			if (action % 2 == 0) {
				try {
					getIntegersFromSource();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} else {
				setIntegersFromSource();
			}
		}
		System.out.println("thread" + getName() + "stopped");
	}

	private void setIntegersFromSource() {
		Integer number = rand.nextInt(500);
		
		synchronized (resource) {
			resource.setElement(number);
			System.out.println("thread" + getName() + "add a new integer to a resource" + "\t" + number);
			resource.notify();
		}
		
	}

	private void getIntegersFromSource() throws InterruptedException {
		Integer number;
		
		synchronized (resource) {
			System.out.println("thread " + getName() + "tried extract a new integer");
			number = resource.getElement();
			while(number == null) {
				System.out.println("thread " + getName() + "waiting queue");
				resource.wait();
				System.out.println("thread " + getName() + "started working");
			}
			System.out.println("thread " + getName() + "extracted a new integer" + "\t" + number);
		}
		
	}
	
	
	
	
}
