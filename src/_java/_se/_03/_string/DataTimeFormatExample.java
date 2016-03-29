/**
 * 
 */
package _java._se._03._string;

import java.util.Calendar;
import java.util.Formatter;

/**
 * @author Lartsev
 *
 */
public class DataTimeFormatExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Formatter formatter = new Formatter();
		Calendar calendar = Calendar.getInstance();
		formatter.format("%tr", calendar);
		System.out.println(formatter); 

	}

}
