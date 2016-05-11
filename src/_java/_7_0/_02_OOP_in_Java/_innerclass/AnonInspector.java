/**
 * 
 */
package _java._7_0._02_OOP_in_Java._innerclass;

/**
 * @author Lartsev
 *
 */
public class AnonInspector {

	public void printSecond() {
		SimpleClass myCl = new SimpleClass() {
			public void print() {
				System.out.println("!!!!!!!!!!!!!!!");
				meth();
			}
			
			public void meth() {
				System.out.println("&&&&&&&&&&&");
			}
		};
		
		SimpleClass myCl2 = new SimpleClass();
		myCl.print();
		myCl2.print();
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AnonInspector as = new AnonInspector();
		as.printSecond();

	}

}
