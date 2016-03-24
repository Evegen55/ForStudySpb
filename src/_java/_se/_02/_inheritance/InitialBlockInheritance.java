/**
 * 
 */
package _java._se._02._inheritance;

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
