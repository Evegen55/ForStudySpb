/**
 * 
 */
package _java._7_0._02_OOP_in_Java._generics;

import java.util.Date;

/**
 * @author Lartsev
 *
 */
public class GenericMethodOverload {
	
	public static <Type> void method (Type obj) {
		System.out.println("<Type void > method (Type obj)" + "\n");
	}
	
	public static void method (Number obj) {
		System.out.println("method (Number obj)" + "\n");
	}
	
	public static void method (Integer obj) {
		System.out.println("method (Integer obj)" + "\n");
	}
	
	public static void method (String obj) {
		System.out.println("method (String obj)" + "\n");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Number number = new Integer(1);
		Integer integer = new Integer(1);
		
		method(number);
		method(integer);
		method(23);
		method("string");
		method(new Date());
		

	}

}
