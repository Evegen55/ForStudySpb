/**
 *
 */
package _java._7_0._02_OOP_in_Java._task02_03;

/**
 * @author Lartsev
 *
 */
public class Stationery implements Priced {

	private double price;


	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}


	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public boolean isPriced() {
		if (this.price != 0) return true;
		return false;
	}
	
	

}
