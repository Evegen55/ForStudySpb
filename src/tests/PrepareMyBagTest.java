package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.javacodegeeks.junit.FirstDayAtSchool;

public class PrepareMyBagTest {
	
	FirstDayAtSchool school = new FirstDayAtSchool();
	String[] bag1 = { "Books", "Notebooks", "Pens" };
	
	@Test
	public void testPrepareMyBag() {
		//fail("Not yet implemented");
		System.out.println("Inside testPrepareMyBag()");
		assertArrayEquals(bag1, school.prepareMyBag());
	}

}
