/**
 * 
 */
package _java._se._07_Multithreading._synchronized;

/**
 * @author Lartsev
 *
 */
public class OperatorWithDrawSync extends Thread {
	private AccountWithSync aws;

	/**
	 * @param aws
	 */
	public OperatorWithDrawSync(AccountWithSync aws) {
		this.aws = aws;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			aws.withdraw(100);
			System.out.println("Balance DEPOSIT is:" + aws.getBalance());
		}
	}
}
