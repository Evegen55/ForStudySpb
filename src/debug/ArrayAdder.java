/**
 * 
 */
package debug;

/**
 * @author Evegen
 *
 */
public class ArrayAdder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] numbers = {3,5,43,2,5,33,2,45,5,3}; 
		int checkGreaterThan = 100; 
		int sumOfNumbers = 0; 
		for (int i = 0; i < numbers.length; i++) {
			sumOfNumbers += numbers[ i];
			if (sumOfNumbers > checkGreaterThan) { 
				System.out.println(" It is greater"); 
				break; 
				} 
			}
	}

}
