/**
 * 
 */
package _java._se._02._innerclass;

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
