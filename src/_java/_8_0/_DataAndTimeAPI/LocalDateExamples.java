/**
 * 
 */
package _java._8_0._DataAndTimeAPI;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

/**
 * @author Lartsev
 *
 */
public class LocalDateExamples {

	/**
	 * 
	 */
	public LocalDateExamples() {
		// TODO Auto-generated constructor stub
	}
	
	public void doSmth() {
		LocalDate ld = LocalDate.of(2015, 1, 31).plusMonths(1);
		System.out.println(ld);
		ld = LocalDate.of(2016, 1, 31).plusMonths(1);
		System.out.println(ld);
		ld = LocalDate.of(2016, 3, 31).minusMonths(1);
		System.out.println(ld);
		ld = LocalDate.now();
		System.out.println(ld);
		
		//date of first Tuesday of the month
		for (int i = 1; i <13; i++) {
			ld = LocalDate.of(2016, i, 1).with(TemporalAdjusters.nextOrSame(DayOfWeek.TUESDAY));
			System.out.println("first Tuesday of the "+ ld.getMonth() + " month" + "\t" + ld);
		}
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LocalDateExamples lde = new LocalDateExamples();
		lde.doSmth();

	}

}
