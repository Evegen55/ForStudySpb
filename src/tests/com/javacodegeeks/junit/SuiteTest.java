package tests.com.javacodegeeks.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
@RunWith(Suite.class)
@Suite.SuiteClasses({ PrepareMyBagTest.class, AddPencilsTest.class })
//With the @Suite.SuiteClasses annotation you can define which test classes 
//will be included in the execution.
public class SuiteTest {
	
}
