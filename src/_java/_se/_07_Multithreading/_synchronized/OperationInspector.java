/**
 *
 */
package _java._se._07_Multithreading._synchronized;

/**
 * @author Lartsev
 *
 */
public class OperationInspector {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		Account account = new Account(200);
		OperatorDeposit opD = new OperatorDeposit(account);
		OperatorWithDraw opW = new OperatorWithDraw(account);

		opD.start();
		opW.start();

		opD.join();
		opW.join();

		System.out.println("Balance is:" + account.getBalance());
	}

}
