/**
 * 
 */
package _java._7_0._02_OOP_in_Java._task05;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lartsev
 *
 */
public class Group {
	
	private Subjects subject;
	private List<Student> listOfStudents;
	
	/**
	 * @param subject
	 */
	public Group(Subjects subject) {
		this.subject = subject;
		listOfStudents = new ArrayList<Student>();
	}

	/**
	 * @param subject
	 * @param listOfStudents
	 */
	public Group(Subjects subject, List<Student> listOfStudents) {
		this.subject = subject;
		this.listOfStudents = listOfStudents;
	}

	/**
	 * @return the listOfStudents
	 */
	public List<Student> getListOfStudents() {
		return listOfStudents;
	}

	/**
	 * @param listOfStudents the listOfStudents to set
	 */
	public void setListOfStudents(List<Student> listOfStudents) {
		this.listOfStudents = listOfStudents;
	}

	/**
	 * @return the subject
	 */
	public Subjects getSubject() {
		return subject;
	}
	
	/**
	 * 
	 * @param std
	 */
	public void addStudent(Student std){
		if(!listOfStudents.contains(std)) {
			listOfStudents.add(std);
			System.out.println("student " + std.getFirstName() + " added in the list witn subject " + subject);
		} else {
			System.out.println("subject alredy in the list");
		}
	}
	

}
