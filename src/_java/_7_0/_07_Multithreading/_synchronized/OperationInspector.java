/**
 *
 */
package _java._7_0._07_Multithreading._synchronized;

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

		System.out.println("Balance UNSYNCHRONIZED is:" + account.getBalance());
		
		System.out.println("\n" + "NOTICE: IF YOU TRY TO RUN APP AGAIN YOU WILL SEE THAT RESULT OF HIGHER"
				+ "\n" + "PROGRAM RETURN OTHER BALANCE AMOUNT INSTEAD BELOW SYNCRONIZED CODE" + "\n");
		
		AccountWithSync aws = new AccountWithSync(200);
		OperatorDepositSync opDs = new OperatorDepositSync(aws);
		OperatorWithDrawSync opWs = new OperatorWithDrawSync(aws);

		opDs.start();
		opWs.start();

		opDs.join();
		opWs.join();

		System.out.println("Balance SYNCHRONIZED is:" + aws.getBalance());
	}

}
