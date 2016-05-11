/**
 * 
 */
package _java._7_0._05_Exceptions_Errors._trycatch;

/**
 * @author Lartsev
 *
 */
public class NestedTry {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			int a = args.length;
			System.out.println("a = " + a);
			int b = 42 / a;
			function(a);
		} catch (ArithmeticException e) {
			System.out.println("division with zero");
		}

	}

	private static void function(int a) {
		try {
			if (a == 1) {
				a = a/(a-a);
			}
			if (a == 2) {
				int[] c = {1};
				c[42] = 99;
			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Index Out Of Bounds Exception");
		}
	}

}
