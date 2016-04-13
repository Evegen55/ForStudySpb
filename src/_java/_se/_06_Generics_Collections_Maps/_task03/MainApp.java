/**
 * 
 */
package _java._se._06_Generics_Collections_Maps._task03;

import java.util.ArrayList;
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
		//Doctor doctor2 = new MedicalStaff();
		//Doctor doctor3 = new HeadDoctor();
		Object object1 = new HeadDoctor();
		//HeadDoctor doctor5 = new Object();
		//Doctor doctor6  = new Nurse();
		//Nurse nurse = new Doctor();
		Object object2 = new Nurse();
		
		
		MedicalStaff md = new Doctor();
		
		List<Doctor> list1= new ArrayList<Doctor>();
		//List<MedicalStaff> list2 = new ArrayList<Doctor>();
		
		List<MedicalStaff> list3 = new ArrayList<MedicalStaff>();
		list3.add(new Doctor());
		
		//List<Doctor> list4 = new ArrayList<(Doctor) MedicalStaff>();
		//List<Object> list5 = new ArrayList<Doctor>();
		

	}

}
