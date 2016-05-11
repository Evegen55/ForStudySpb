/**
 * 
 */
package _java._7_0._02_OOP_in_Java._task05;

import java.util.List;

/**
 * @author Lartsev
 *
 */
public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GroupCreator gc = new GroupCreator();
		//gc.createHeapOfStudents(9);
		List<Group> lg = gc.setStudentsToGroupBySubjects();
		System.out.println(lg.size());
		
		for (Group gp : lg) {
			System.out.println("nums of student in the group "  + gp.getSubject() + "\t" + gp.getListOfStudents().size());
		}
    }

}
