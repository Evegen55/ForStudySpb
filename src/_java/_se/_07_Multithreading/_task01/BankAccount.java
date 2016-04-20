/**
 * This class is a simple model bank account with synchronized
 * method for deposit or withdraw money.
 * It also override methods toString and equals for using with
 * thread-safe ADT (abstract data type).
 * When thread read a file it creates an object  BankAccount with
 * name and balance and tried to storing it in ADT. If this object is
 * already present in the ADT, then thread get an amount of this object and
 * merge it with stored account using method mergeBalance(int amount).
 *
 */
package _java._se._07_Multithreading._task01;

/**
 * @author Lartsev
 *
 */
public class BankAccount {

	private int balance;
	private String name;

	/**
	 * @param balance
	 * @param name
	 */
	public BankAccount(int balance, String name) {
		this.balance = balance;
		this.name = name;
	}

	/**
	 * @return the balance
	 */
	public int getBalance() {
		return balance;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 *
	 * @param amount
	 */
	public synchronized void mergeBalance(int amount){
		int x = balance + amount;
		try {
			Thread.sleep(15);
		} catch (InterruptedException e) {
			System.out.println("Exception in:");
			e.printStackTrace();
		}
		balance = x;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BankAccount [balance=" + balance + ", name=" + name + ", "
				+ "hashCode()=" + hashCode() + ", super.toString()="
				+ super.toString() + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + balance;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankAccount other = (BankAccount) obj;
		if (balance != other.balance)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}



}
