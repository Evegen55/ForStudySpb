/**
 * 
 */
package _java._7_0._07_Multithreading._waitnotify;

/**
 * @author Lartsev
 *
 */
public class UserResourcethread {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		SharedResource res = new SharedResource();
		
		IntegergetterSetter t1 = new IntegergetterSetter("1", res);
		IntegergetterSetter t2 = new IntegergetterSetter("2", res);
		IntegergetterSetter t3 = new IntegergetterSetter("3", res);
		IntegergetterSetter t4 = new IntegergetterSetter("4", res);
		IntegergetterSetter t5 = new IntegergetterSetter("5", res);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		Thread.sleep(1000);
		
		t1.stopThread();
		t2.stopThread();
		t3.stopThread();
		t4.stopThread();
		t5.stopThread();
		
		t1.join();
		t2.join();
		t3.join();
		t4.join();
		t5.join();
		
		System.out.println("main");

	}

}
