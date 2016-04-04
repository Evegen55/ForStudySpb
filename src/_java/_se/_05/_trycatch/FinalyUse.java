/**
 *
 */
package _java._se._05._trycatch;

/**
 * @author Lartsev
 *
 */
public class FinalyUse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			procA();

		} catch (Exception e) {
			System.out.println("doing throw: ");
			e.printStackTrace();
		}
		procB();
		procC();
		
	}

	private static void procC() {
		try {
			System.out.println("Incide procC()");
			throw new RuntimeException("demo");
		}  finally {
			System.out.println("finally procC()");
		}

	}

	private static void procB() {
		try {
			System.out.println("Incide procB()");
			throw new RuntimeException("demo");

		}  finally {
			System.out.println("finally procB()");
		}

	}

	private static void procA() {
		try {
			System.out.println("Incide procA()");
			throw new RuntimeException("demo");
		}  finally {
			System.out.println("finally procA()");
		}

	}

	

}
