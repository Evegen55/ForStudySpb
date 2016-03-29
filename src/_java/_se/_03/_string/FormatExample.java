/**
 * 
 */
package _java._se._03._string;

import java.util.Formatter;
import java.util.Timer;

/**
 * @author Lartsev
 *
 */
public class FormatExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Formatter formatter = new Formatter();
		boolean b1 = true;
		Boolean b2 = null;
		
		formatter.format("1. - %b, %b\n", b1, b2);//1. - true, false
		System.out.println(formatter);
		System.out.println("=======================================");
		Timer t = new Timer();
		formatter.format("2. - %h\n", t);
		System.out.println(formatter); //1. - true, false
		                               //2. - 4aa298b7
		System.out.println("=======================================");
		double d1 = 16.78789;
		formatter.format("%1$e, %<f, %<g, %<a\n", d1);
		System.out.println(formatter);
		
		System.out.println("=======================================");
		int i1 = 17;
		formatter.format("1. (%%o) %o%n", i1);
		formatter.format("2. (%%a) %a%n", d1);
		formatter.format("3. (%%x) %x%n", i1);
		formatter.format("4. (%%#o) %#o%n", i1);
		formatter.format("5. (%%#a) %#a%n", d1);
		formatter.format("6. (%%#x) %#x%n", i1);
		System.out.println(formatter);
		

	}

}
