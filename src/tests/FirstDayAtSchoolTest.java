package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.javacodegeeks.junit.FirstDayAtSchool;

public class FirstDayAtSchoolTest {
	
	FirstDayAtSchool school = new FirstDayAtSchool();
	String[] bag1 = { "Books", "Notebooks", "Pens" };
	String[] bag2 = { "Books", "Notebooks", "Pens", "Pencils" };
	
	@Test
	public void testPrepareMyBag() {
		//fail("Not yet implemented");
		System.out.println("Inside testPrepareMyBag()");
		assertArrayEquals(bag1, school.prepareMyBag());
	}

	@Test
	public void testAddPencils() {
		//fail("Not yet implemented");
		System.out.println("Inside testAddPencils()");
		assertArrayEquals(bag2, school.addPencils());
	}

}
