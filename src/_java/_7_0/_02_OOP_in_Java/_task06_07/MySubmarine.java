/**
 *
 */
package _java._7_0._02_OOP_in_Java._task06_07;

import java.lang.annotation.Documented;

/**
 * @author Lartsev
 *
 */
@Documented
public @interface MySubmarine {
	/**
	 * battle type
	 * @return
	 */
	String type();

	/**
	 * Country that manufactured this submarine
	 * @return
	 */
	String manufactured();

	/**
	 * Type of engine
	 * @return
	 */
	String engineType();

	/**
	 *
	 * @return
	 */
	int engineNumbers();
}
