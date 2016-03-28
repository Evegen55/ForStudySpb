/**
 *
 */
package _java._se._02._task05;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Lartsev
 *
 */
public class GroupCreator {

	/**
	 *
	 * @param studentName
	 * @param studentFirstname
	 * @param subjects
	 * @return
	 */
	public Student createStudentWitnSetOfSubjects(String studentName, String studentFirstname, Subjects... subjects){

		Student student = new Student(studentName, studentFirstname);

		for (Subjects sbj : subjects) {
			student.addSubject(sbj);
		}
		return student;
	}

	/**
	 * all of students in the heap contains all subjects
	 * @param numOfStudents
	 * @return
	 */
	public List<Student> createHeapOfStudents(int numOfStudents) {
		List<Student> HeapOfStudents  = new ArrayList<Student>();
		for (int i = 0; i < numOfStudents; i++) {
			Subjects[] val = Subjects.values();
			Student st = createStudentWitnSetOfSubjects("studentName"+i, "studentFirstname"+i, val);

			//add random grade
			Random rnd = new Random();
			for (int a = 0; a < val.length; a++) {
				if(val[a].isNaturalGrade()) {
					st.setGradeOnSubject(rnd.nextInt(), val[a]);
				} else {
					st.setGradeOnSubject(rnd.nextDouble(), val[a]);
				}
			}


			HeapOfStudents.add(st);
		}
		return HeapOfStudents;
	}

	/**
	 *
	 * @return
	 */
	public List<Group> createBunchOfGroup() {
		List<Group> HeapOfGroups  = new ArrayList<Group>();
		Subjects[] val = Subjects.values();
		for (int i = 0; i < val.length; i++) {
			Group group = new Group(val[i]);
			HeapOfGroups.add(group);
		}
		return HeapOfGroups;
	}

	/**
	 * @return
	 *
	 */
	public List<Group> setStudentsToGroupBySubjects(){
		List<Group> goupList = createBunchOfGroup();
		List<Student> studentList = createHeapOfStudents(10);

		for (Student st : studentList) {
			for (Subjects sbj : st.getListOfSubjects()) {
				for(Group gp : goupList){
					if(gp.getSubject() == sbj) {
						gp.addStudent(st);
					}
				}
			}
		}
		return goupList;
	}



}
