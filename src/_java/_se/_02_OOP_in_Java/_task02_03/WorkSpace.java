/**
 *
 */
package _java._se._02_OOP_in_Java._task02_03;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lartsev
 *
 */
public class WorkSpace {
	private List<Stationery> listItems;

	/**
	 *
	 */
	public WorkSpace() {
		this.listItems = new ArrayList<Stationery>();
	}
	/**
	 * @param listItems
	 */
	public WorkSpace(List<Stationery> listItems) {
		this.listItems = listItems;
	}
	/**
	 * @return the listItems
	 */
	public List<Stationery> getListItems() {
		return listItems;
	}
	/**
	 * @param listItems the listItems to set
	 */
	public void setListItems(List<Stationery> listItems) {
		this.listItems = listItems;
	}

	public double PriceOfAllItems() {
		double priceOfAllItems = 0;
		for (Stationery st : listItems) {
			if (st.isPriced()) {
				priceOfAllItems =  priceOfAllItems + st.getPrice();
			}
		}
		
		return priceOfAllItems;
	}


}
