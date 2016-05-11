package _java._7_0._07_Multithreading._deadlock;

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
			//operationDeposit(10); //for deadlock!!!
			operationDeposit2(10);
		}
	}

	private void operationDeposit2(int i) {
		int hashacc1 = account1.hashCode();
		int hashacc2 = account2.hashCode();
		
		Account acc1 = null;
		Account acc2 = null;
		
		if (hashacc1 < hashacc2) {
			acc1 = account1;
			acc2 = account2;
		} else {
			acc1 = account2;
			acc2 = account1;
		}
		synchronized (acc1) {
			System.out.println("Account# 1 blocking");
			synchronized (acc2) {
				System.out.println("Account# 2 blocking");
				account1.deposit(i);
				account2.widthdraw(i);
			}
		}
		System.out.println("Accounts" + "\t" + "UNblocking");
		
	}

	/**
	 * for deadlock!!!!
	 * @param i
	 */
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
