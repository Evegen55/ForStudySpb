/**
 * 
 */
package _java._se._02_OOP_in_Java._inheritance;

/**
 * @author Lartsev
 *
 */
public class Doctor extends Man {
	
	static{
		System.out.println("static block in Doctor" + "\n");
	}
	
	public static void stDoctor(){
		System.out.println("static method in Doctor" + "\n");
	}

}