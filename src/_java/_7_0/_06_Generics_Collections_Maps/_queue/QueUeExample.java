/**
 * 
 */
package _java._7_0._06_Generics_Collections_Maps._queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Lartsev
 *
 */
public class QueUeExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Queue<String> q= new LinkedList<>();
		q.offer("first");
		q.offer("second");
		q.offer("third");
		q.offer("fourth");
		q.offer("fifth");
		while(q.size() > 0) {
			System.out.print(q.remove() + "\t");
		}

	}

}
