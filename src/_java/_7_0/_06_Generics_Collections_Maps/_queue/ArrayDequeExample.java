/**
 * 
 */
package _java._7_0._06_Generics_Collections_Maps._queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

/**
 * @author Lartsev
 *
 */
public class ArrayDequeExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Deque<String> q= new ArrayDeque<>();
		q.push("first");
		q.push("second");
		q.push("third");
		q.push("fourth");
		q.push("fifth");
		while(!q.isEmpty()) {
			System.out.print(q.pop() + "\t");
		}
		System.out.println();
		System.out.println("==================");
		Deque<String> s= new ArrayDeque<>();
		s.add("first");
		s.add("second");
		s.add("third");
		s.add("fourth");
		s.add("fifth");
		while(!s.isEmpty()) {
			System.out.print(s.pop() + "\t");
		}
	}

}
