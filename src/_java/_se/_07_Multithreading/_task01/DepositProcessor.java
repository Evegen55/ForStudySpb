/**
 * This class getting as paramether shared resource and array of strings
 * which has been split from a single line (we aren't check it for size
 * of array). Then, after creating an object of BankAccount it tries to
 * store in the shared resource. If this object is
 * already present in the shared resource, then thread get an amount of this object
 * and merge it with stored account using method methods deposit and widthdraw.
 */
package _java._se._07_Multithreading._task01;

/**
 * @author Lartsev
 *
 */
public class DepositProcessor extends Thread {

	private String[] readedBodyOfAccount;
	private SharedResource resource;

	/**
	 * @param readedBodyOfAccount
	 * @param resource
	 */
	public DepositProcessor(String[] readedBodyOfAccount, SharedResource resource) {
		this.readedBodyOfAccount = readedBodyOfAccount;
		this.resource = resource;
	}

	public DepositProcessor() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		//parse array of strings
		String name = readedBodyOfAccount[2];
		int amount = Integer.parseInt(readedBodyOfAccount[3].trim());
		//test code
		System.out.println(this.getName() + "started");
		
		processorUnit(name, amount);

	}

	/**
	 * @param name
	 * @param amount
	 */
	private void processorUnit(String name, int amount) {
		BankAccount account = new BankAccount(amount, name);

		//synchronized (resource) {
			if (!resource.isAccountInResourse(account)) {
				resource.addToResource(account);
				//test code
				System.out.println(this.getName() + "---------------add acc---------------");
				
			} else {
				//using synchronized method
				if (amount < 0) {
					//test code
					System.out.println(this.getName() + "---");
					
					resource.getAccount(account).withdraw(amount);
				} else {
					//test code
					System.out.println(this.getName() + "+++");
					
					resource.getAccount(account).deposit(amount);
				}
			}
		//}
	}
}
