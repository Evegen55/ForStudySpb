package _java._se._07_Multithreading._synchronized;

public class OperatorDeposit extends Thread {
	private Account account;

	/**
	 * @param account
	 */
	public OperatorDeposit(Account account) {
		this.account = account;
	}

	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			account.deposit(100);
			System.out.println("Balance DEPOSIT is:" + account.getBalance());
		}
	}



}
