/**
 *
 */
package _java._se._06_Generics_Collections_Maps._legacy;

import java.util.Stack;
import java.util.StringTokenizer;

/**
 * @author Lartsev
 *
 */
public class StackExample {

	static boolean checkParity(String expression, String open, String close){
		Stack<String> stack = new Stack<>();
		StringTokenizer st = new StringTokenizer(expression, "\t\n\r+*/-(){}", true);
		while(st.hasMoreElements()) {
			String tmp = st.nextToken();
			if(tmp.equals(open)) {
				System.out.println("open");
				stack.push(open);
			}
			if(tmp.equals(close)) {
				System.out.println("close");
				stack.pop();
			}
		}
		if (stack.isEmpty()) {
			return true;
		} else
		return false;
		}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(
				checkParity("a - (b -(c - a) / (b + c) - 2)", "(", ")")
				);

	}

}
