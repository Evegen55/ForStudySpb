/**
 * 
 */
package _java._7_0._02_OOP_in_Java._inheritance;

/**
 * @author Lartsev
 *
 */
public class InitialBlockInheritance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Doctor.stMan();
		System.out.println("create a new instance of Doctor: " + "\n");
		
		Doctor doctor = new Doctor();
		System.out.println("form invoked from Doctor: " + doctor.form + "\n");
		
		Doctor.stDoctor();
		

	}

}
