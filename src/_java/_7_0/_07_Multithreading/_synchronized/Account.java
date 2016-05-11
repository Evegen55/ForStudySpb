/**
 *
 */
package _java._7_0._07_Multithreading._synchronized;

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
	 * @param amount
	 */
	public void deposit(int amount){
		int x = balance + amount;
		try {
			Thread.sleep(15);
		} catch (InterruptedException e) {
			System.out.println("Exception in:");
			e.printStackTrace();
		}
		balance = x;
	}
	public void withdraw(int amount) {
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
