package _java._se._07_Multithreading._task01;

import java.util.ArrayList;
import java.util.List;

public class SharedResource {
	
	private List<BankAccount> list;

	/**
	 * 
	 */
	public SharedResource() {
		list = new ArrayList<>();
	}
	
	/**
	 * 
	 * @param account
	 */
	public void addToResource(BankAccount account) {
		list.add(account);
	}
	
	/**
	 * 
	 * @param account
	 * @return
	 */
	public boolean isAccountInResourse(BankAccount account) {
		return list.contains(account);
	}

	/**
	 * 
	 * @param account
	 * @return
	 */
	public BankAccount getAccount(BankAccount account) {
		return list.get(list.indexOf(account));
	}

	/**
	 * @return the list
	 */
	public List<BankAccount> getList() {
		return list;
	}

	
}
