/**
 * 
 */
package _java._se._05_Exceptions_Errors._trycatch;

/**
 * @author Lartsev
 *
 */
public class ThrowsGenerator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			throwOne();
		} catch (IllegalAccessException e) {
			System.out.println("doing throw: ");
			e.printStackTrace();
		}

	}

	private static void throwOne() throws IllegalAccessException {
		System.out.println("Incide throwOne()");
		throw new IllegalAccessException("demo");
		
	}

}
