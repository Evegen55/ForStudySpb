/**
 *
 */
package _java._se._02_OOP_in_Java._classandobject;

/**
 * @author Lartsev
 *
 */
public class StaticBlock {

	private double baseSalary;
	public static double increaseCoeffitient = 2.5;

	static {
		increaseCoeffitient = 1.5;
		//baseSalary = 100; - ERROR
	}



	/**
	 * @param baseSalary
	 */
	public StaticBlock(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	/**
	 *
	 * @return
	 */
	public double calcSalary() {
		return baseSalary * increaseCoeffitient;
	}

	/**
	 *
	 * @param newIncreaseCoeffitient
	 */
	public static void setIncreaseCoeffitient(double newIncreaseCoeffitient){
		increaseCoeffitient = newIncreaseCoeffitient;
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StaticBlock sb = new StaticBlock(5.0);

	}

}
