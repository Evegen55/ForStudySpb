package tests.com.javacodegeeks.junit.suite;

import static org.junit.Assert.*;

import org.junit.Test;

import com.javacodegeeks.junit.FirstDayAtSchool;

public class AddPencilsTest {
	
	FirstDayAtSchool school = new FirstDayAtSchool();
	String[] bag2 = { "Books", "Notebooks", "Pens", "Pencils" };
	
	@Test
	public void testAddPencils() {
		//fail("Not yet implemented");
		System.out.println("Inside testAddPencils()");
		assertArrayEquals(bag2, school.addPencils());
	}

}
