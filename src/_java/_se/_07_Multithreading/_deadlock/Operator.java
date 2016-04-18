package _java._se._07_Multithreading._deadlock;

public class Operator extends Thread {
	private Account account1;
	private Account account2;
	
	/**
	 * @param account1
	 * @param account2
	 */
	public Operator(Account account1, Account account2) {
		this.account1 = account1;
		this.account2 = account2;
	}

	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		for (int i =0; i <3; i++) {
			operationDeposit(10);
		}
	}

	private void operationDeposit(int i) {
		synchronized (account1) {
			System.out.println("Account# 1 blocking");
			synchronized (account2) {
				System.out.println("Account# 2 blocking");
				account1.deposit(i);
				account2.widthdraw(i);
			}
		}
		
	}
	
	
}
