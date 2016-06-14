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
	
	public CalculateTest(int expectedResult, int firstNumber, int secondNumber) {
		this.expected = expectedResult;
		this.first = firstNumber;
		this.second = secondNumber;
	}
	@Parameters
	public static Collection addedNumbers() {
		return Arrays.asList(new Integer[][] { { 3, 1, 2 }, { 5, 2, 3 },
		{ 7, 3, 4 }, { 9, 4, 5 }, });
	}
	@Test
	public void sum() {
		Calculate add = new Calculate();
		System.out.println("Addition with parameters : " + first + " and "
		+ second);
		assertEquals(expected, add.sum(first, second));
	}
}
