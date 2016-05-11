/**
 * 
 */
package _java._7_0._02_OOP_in_Java._innerclass;

/**
 * @author Lartsev
 *
 */
public class Outer1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Inner1.method();

	}
	
	public void meth() {
		Inner1.method();
	}
	
	static class Inner1 {
		public static void method() {
			System.out.println("inner static method");
			
		}
	}

	

}
