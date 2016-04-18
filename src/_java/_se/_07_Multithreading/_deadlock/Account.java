/**
 * 
 */
package _java._se._07_Multithreading._deadlock;

/**
 * @author Lartsev
 *
 */
public class Account {
	private int balance;

	/**
	 * @param balance
	 */
	public Account(int balance) {
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
	 */
	public void deposit(int amount) {
		balance = balance + amount;
	}
	
	/**
	 *
	 */
	public void widthdraw(int amount) {
		balance = balance - amount;
	}
}
