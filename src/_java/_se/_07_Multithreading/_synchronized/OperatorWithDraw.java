/**
 *
 */
package _java._se._07_Multithreading._synchronized;

/**
 * @author Lartsev
 *
 */
public class OperatorWithDraw extends Thread {
	private Account account;

	/**
	 * @param account
	 */
	public OperatorWithDraw(Account account) {
		this.account = account;
	}

	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			account.withdraw(50);
			System.out.println("Balance WITHDRAW is:" + account.getBalance());
		}
	}
}
