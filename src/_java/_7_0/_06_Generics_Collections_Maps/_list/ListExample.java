/**
 * 
 */
package _java._7_0._06_Generics_Collections_Maps._list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author Lartsev
 *
 */
public class ListExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> lst = new ArrayList<>();
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(4);
		lst.add(5);
		lst.add(6);
		lst.add(7);
		lst.add(8);
		lst.add(9);
		lst.add(10);
		lst.add(11);
		System.out.println("list of integers");
		System.out.println(lst);
		
		LinkedList<Object> lstLink = new LinkedList<>(lst);
		lstLink.add(1, "red");
		lstLink.add(2, "green");
		lstLink.removeLast();
		lstLink.addFirst("blue");
		System.out.println("linked list via iterator (integers with strings together)");
		ListIterator<Object> lstIter = lstLink.listIterator();
		while(lstIter.hasNext()) {
			System.out.print(lstIter.next() + "\t");
		}
		System.out.println();
		System.out.println("display the linked list backward");
		lstIter = lstLink.listIterator(lstLink.size());
		while(lstIter.hasPrevious()) {
			System.out.print(lstIter.previous() + "\t");
		}
	}

}
