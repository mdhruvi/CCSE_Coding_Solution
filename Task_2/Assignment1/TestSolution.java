/**
 * 
 */
package Assignment1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author dhruvimodi
 *
 */
class TestSolution {

	@Test
	void testCase1() {
		int prices[]  = {7,1,5,3,6,4};
		int expected = 5;
		int actual = Solution.maxProfit(prices);
		assertEquals(actual, expected);
	}
	
	@Test
	void testCase2() {
		int prices[]  = {7,6,4,3,1};
		int expected = 0;
		int actual = Solution.maxProfit(prices);
		assertEquals(actual, expected);
	}

}
