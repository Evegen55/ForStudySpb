/**
 * 
 */
package _java._se._06._queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Lartsev
 *
 */
public class DequeExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Deque<String> q= new LinkedList<>();
		q.offer("first");
		q.offer("second");
		q.addFirst("third");
		q.offer("fourth");
		q.offer("fifth");
		while(q.size() > 0) {
			System.out.print(q.remove() + "\t");
		}

	}

}
