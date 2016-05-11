/**
 *
 */
package _java._7_0._02_OOP_in_Java._task02_04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

import _java._7_0._02_OOP_in_Java._task02_03.PaperTray;
import _java._7_0._02_OOP_in_Java._task02_03.PenWithPrice;
import _java._7_0._02_OOP_in_Java._task02_03.ScissorsWithPrice;
import _java._7_0._02_OOP_in_Java._task02_03.Stationery;

/**
 * @author Lartsev
 *
 */
public class SetForNewPerson {

	private List<Stationery> createListOfItems() {
		List<Stationery> listItems = new ArrayList<Stationery>();

		Stationery it1 = new PaperTray(1, "good");
		Stationery it2 = new PaperTray(2, "better");
		Stationery it3 = new PaperTray(3, "the best");

		Stationery it4 = new PenWithPrice(1, 10, 1, "good");
		Stationery it5 = new PenWithPrice(2, 10, 2, "better");
		Stationery it6 = new PenWithPrice(3, 10, 3, "the best");

		Stationery it7 = new ScissorsWithPrice(10, 1, "good");
		Stationery it8 = new ScissorsWithPrice(10, 2, "better");
		Stationery it9 = new ScissorsWithPrice(10, 3, "the best");

		listItems.add(it1);
		listItems.add(it2);
		listItems.add(it3);
		listItems.add(it4);
		listItems.add(it5);
		listItems.add(it6);
		listItems.add(it7);
		listItems.add(it8);
		listItems.add(it9);

		//set random price
		Random rnd = new Random();
		for (int i = 0; i<9; i++) {
			if (!listItems.get(i).isPriced()) {
				listItems.get(i).setPrice(i+rnd.nextDouble()*100);
				System.out.println("Price of item # " + (i+1) + " is:" + "\t" + listItems.get(i).getPrice());
			}

		}
		return listItems;
	}

	public void sortByPrice(List<Stationery> listItems) {

		Comparator<Stationery> comparator = new Comparator<Stationery>() {

			@Override
			public int compare(Stationery arg0, Stationery arg1) {

				return (int) (arg0.getPrice() - arg1.getPrice());
			}

		};

		Collections.sort(listItems, comparator);
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SetForNewPerson sfnp = new SetForNewPerson();
		List<Stationery> lst = sfnp.createListOfItems();
		sfnp.sortByPrice(lst);
		System.out.println("================================================ ");
		for (Stationery st :  lst) {
			System.out.println("Price of item" + " after sorting" + " is:" + "\t" + st.getPrice());
		}




	}

}
