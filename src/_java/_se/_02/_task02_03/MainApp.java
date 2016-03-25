/**
 * 
 */
package _java._se._02._task02_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Lartsev
 *
 */
public class MainApp {
	
	/**
	 * 
	 * @return
	 */
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
	
	/**
	 * create a workspace object
	 */
	public WorkSpace createWorkSpace() {
		
		WorkSpace ws = new WorkSpace(createListOfItems());
		
		return ws;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		MainApp ma = new MainApp();
		WorkSpace ws = ma.createWorkSpace();
		System.out.println("Price of all items on a workspace in pandom order is:" + "\t" + ws.PriceOfAllItems());
		

	}

}
