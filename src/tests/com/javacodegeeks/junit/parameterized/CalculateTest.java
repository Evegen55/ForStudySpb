/**
 * In this section we will see how to create parameterized tests. 
 * For this purpose, we will use the class mentioned in section 2.1 (Calculate)
 * which provides a public method for adding integers. 
 * So, this will be the class to be tested.
 */
package tests.com.javacodegeeks.junit.parameterized;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.javacodegeeks.junit.Calculate;
@RunWith(Parameterized.class)
public class CalculateTest {
	
	private int expected;
	private int first;
	private int second;
	
	/*
	 * The class has a single constructor that stores the test data.
	 */
	public CalculateTest(int expectedResult, int firstNumber, int secondNumber) {
		this.expected = expectedResult;
		this.first = firstNumber;
		this.second = secondNumber;
	}
	/*
	 * The class has a static method that generates and returns test data 
	 * and is annotated with the @Parameters annotation.
	 * 
	 * Each array includes the inputs/output numbers of each test execution.
	 * The number of elements in each array must be the same with the number of 
	 * parameters in the constructor. So, in this specific case, each array
	 * includes three elements, two elements that represent the numbers to be added
	 * and one element for the result.
	 */
	@Parameters
	public static Collection addedNumbers() {
		return Arrays.asList(new Integer[][] { { 3, 1, 2 }, 
											   { 5, 2, 3 },
											   { 7, 3, 4 }, 
											   { 9, 4, 5 }, 
											});
	}
	/*
	 * The class has a test, which obviously means that it needs a method 
	 * annotated with the @Test annotation.
	 */
	@Test
	public void sum() {
		Calculate add = new Calculate();
		System.out.println("Addition with parameters : " + first + " and "
		+ second);
		assertEquals(expected, add.sum(first, second));
	}
	
	/*
	 * As we see in the output, the test case is executed four times, 
	 * which is the number of inputs in the method annotated with @Parameters annotation.
	 */
}
