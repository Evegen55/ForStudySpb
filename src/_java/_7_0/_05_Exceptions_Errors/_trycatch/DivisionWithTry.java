/**
 * 
 */
package _java._7_0._05_Exceptions_Errors._trycatch;

/**
 * @author Lartsev
 *
 */
public class DivisionWithTry {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int d;
		int a;
		try {
			d = 0;
			a = 42/d;
			System.out.println("this text will not be printed anyway");
		} catch (ArithmeticException e) {
			System.out.println("division with zero");
			//or handling exception for some rule, for instance:
			d = 1;
			a = 42/d;
			System.out.println("a = " + a);
		}

	}

}
