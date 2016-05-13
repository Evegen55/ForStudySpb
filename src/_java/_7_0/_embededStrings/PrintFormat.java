/**
 * 
 */
package _java._7_0._embededStrings;

/**
 * @author Lartsev
 *
 */
public class PrintFormat {

	/**
	 * 
	 */
	public void doit() {
		int x = 1;
		double y = 2.5;
		System.out.printf("Строка 1: [%d %f]\n", x, y);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PrintFormat pf = new PrintFormat();
		pf.doit();
	}

}
