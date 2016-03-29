/**
 *
 */
package _java._se._02._task05;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

/**
 * @author Lartsev
 *
 */
public class Student {

	private String firstName;
	private String lastName;
	private List<Subjects> listOfSubjects;
	private int naturalGrades;
	private double nonNaturalGrades;
	private Map naturalGradesBySubject;
	private Map NonNaturalGradesBySubject;


	/**
	 * @param firstName
	 * @param lastName
	 */
	public Student(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		listOfSubjects = new ArrayList<Subjects>();
		naturalGrades = 0;
		nonNaturalGrades = 0.0;
		System.out.println("a new Student has been created:" + "\t" + firstName + "\t" + lastName);
		naturalGradesBySubject = new EnumMap<Subjects, Integer>(Subjects.class);
		NonNaturalGradesBySubject = new EnumMap<Subjects, Double>(Subjects.class);
	}
	/**
	 * @param firstName
	 * @param lastName
	 * @param listOfSubjects
	 */
	public Student(String firstName, String lastName, List<Subjects> listOfSubjects) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.listOfSubjects = listOfSubjects;
		naturalGrades = 0;
		nonNaturalGrades = 0.0;
		System.out.println("a new Student has been created");
		naturalGradesBySubject = new EnumMap<Subjects, Integer>(Subjects.class);
		NonNaturalGradesBySubject = new EnumMap<Subjects, Double>(Subjects.class);
	}

	/**
	 *
	 * @param sbj
	 */
	public void addSubject(Subjects sbj){
		if(!listOfSubjects.contains(sbj)) {
			listOfSubjects.add(sbj);
			System.out.println("subject ADDED in the LIST");
			addSubjectToMap(sbj);
		} else {
			System.out.println("subject alredy in the list");
		}
	}

	/**
	 * add subject to a map depends on type of grades with grades = 0
	 * @param sbj
	 */
	public void addSubjectToMap(Subjects sbj){
		if (sbj.isNaturalGrade()) {
			if(!naturalGradesBySubject.containsKey(sbj)) {
				naturalGradesBySubject.put(sbj, 0);
				System.out.println("subject ADDED in the natural MAP");
			} else {
				System.out.println("subject alredy in the MAP");
		    }
		} else {
			if(!NonNaturalGradesBySubject.containsKey(sbj)) {
				NonNaturalGradesBySubject.put(sbj, 0);
				System.out.println("subject ADDED in the NON natural MAP");
			} else {
				System.out.println("subject alredy in the MAP");
		    }
		}
	}

	/**
	 * 
	 * @param grade
	 * @param sbj
	 */
	public <T extends Number> void setGradeOnSubject(T grade, Subjects sbj) {
	    if (grade.getClass().toString().equalsIgnoreCase("class java.lang.Integer")) {
		//System.out.println(grade.getClass());

		} else if (grade.getClass().toString().equalsIgnoreCase("class java.lang.Double")) {

		//System.out.println(grade.getClass());
		}
	}

	/**
	 * @return the listOfSubjects
	 */
	public List<Subjects> getListOfSubjects() {
		return listOfSubjects;
	}

	/**
	 * @return the naturalGrades
	 */
	public int getNaturalGrades() {
		return naturalGrades;
	}

	/**
	 * @return the nonNaturalGrades
	 */
	public double getNonNaturalGrades() {
		return nonNaturalGrades;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}







}
