/**
 * 
 */
package _java._8_0._NewADT;

import java.util.Optional;

/**
 * @author Lartsev
 *
 */
public class OptionalExamples {

	/**
	 * 
	 */
	public OptionalExamples() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 
	 * @param x
	 * @return
	 */
	public static Optional<Double> inverse(Double x) {
		return x == 0 ? Optional.empty() : Optional.of(1/x);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(inverse(12.0).get());
		System.out.println(inverse(0.0).isPresent());
	}

}
