/**
 * 
 */
package _java._7_0._02_OOP_in_Java._classandobject;

/**
 * @author Lartsev
 *
 */
public class Pen {
	
	private int price;
	
	private String producerName;

	/**
	 * 
	 */
	public Pen() {}
	
	

	/**
	 * @param price
	 * @param producerName
	 */
	public Pen(int price, String producerName) {
		this.price = price;
		this.producerName = producerName;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + price;
		result = prime * result + ((producerName == null) ? 0 : producerName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pen other = (Pen) obj;
		if (price != other.price)
			return false;
		if (producerName == null) {
			if (other.producerName != null)
				return false;
		} else if (!producerName.equals(other.producerName))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Pen [price=" + price + ", producerName=" + producerName + ", getClass()=" + getClass() + "]";
	}

}
