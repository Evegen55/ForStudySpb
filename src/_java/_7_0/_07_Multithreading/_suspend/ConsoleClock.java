/**
 * 
 */
package _java._7_0._07_Multithreading._suspend;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Lartsev
 *
 */
public class ConsoleClock extends Thread {

	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		for (int i = 0; i < 10; i ++) {
			System.out.println(i + " - " + time());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
	}

	private String time() {
		Date d = new Date();
		SimpleDateFormat s = new SimpleDateFormat("hh/mm/ss");
		return s.format(d);
	}

}
