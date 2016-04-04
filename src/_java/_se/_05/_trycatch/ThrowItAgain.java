/**
 *
 */
package _java._se._05._trycatch;

/**
 * @author Lartsev
 *
 */
public class ThrowItAgain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			int a = args.length;
			try {
				if (a == 1) {
					a = a/(a-a);
				}
				if (a == 2) {
					int[] c = {1};
					c[42] = 99;
				}
			} catch (IndexOutOfBoundsException e) {
				System.out.println("Index Out Of Bounds Exception and new exceprion has been throws again");
				//GENERATE IT AGAIN
				throw e;
			}
			int b = 42 / a;
			System.out.println("a = " + a);
		} catch (ArithmeticException e) {
			System.out.println("division with zero");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("general handling");
			//e.printStackTrace();
		}

	}

}
