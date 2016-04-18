/**
 * 
 */
package _java._se._07_Multithreading._deadlock;

/**
 * @author Lartsev
 *
 */
public class OperatorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Account acc1 = new Account(200);
		Account acc2 = new Account(300);
		
		Operator op1 = new Operator(acc1, acc2);
		Operator op2 = new Operator(acc1, acc2);
		
		op1.start();
		op2.start();
		
	}

}
