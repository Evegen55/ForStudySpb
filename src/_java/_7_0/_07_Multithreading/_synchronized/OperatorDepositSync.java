/**
 * 
 */
package _java._7_0._07_Multithreading._synchronized;

/**
 * @author Lartsev
 *
 */
public class OperatorDepositSync extends Thread {
	private AccountWithSync aws;

	/**
	 * @param aws
	 */
	public OperatorDepositSync(AccountWithSync aws) {
		this.aws = aws;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			aws.deposit(100);
			System.out.println("Balance DEPOSIT is:" + aws.getBalance());
		}
	}

	
}
