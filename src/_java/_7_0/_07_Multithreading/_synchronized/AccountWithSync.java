/**
 * 
 */
package _java._7_0._07_Multithreading._synchronized;

/**
 * @author Lartsev
 *
 */
public class AccountWithSync {
	private int balance;

	/**
	 * @param balance
	 */
	public AccountWithSync(int balance) {
		this.balance = balance;
	}

	/**
	 * @return the balance
	 */
	public int getBalance() {
		return balance;
	}

	/**
	 *
	 * @param amount
	 */
	public synchronized void deposit(int amount){
		int x = balance + amount;
		try {
			Thread.sleep(15);
		} catch (InterruptedException e) {
			System.out.println("Exception in:");
			e.printStackTrace();
		}
		balance = x;
	}
	public synchronized void withdraw(int amount) {
		int x = balance - amount;
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			System.out.println("Exception in:");
			e.printStackTrace();
		}
		balance = x;
	}
}
