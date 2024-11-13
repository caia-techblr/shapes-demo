package org.gitam.cseblr;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NumericChecks
{
	public static boolean isEven(int n)
	{
		return n%2==0;
	}
	public static int sum(int x,int y)
	{
		return x + y;
	}
}

class SampleTest {

	/*@Test
	void testOne() {
		fail("Not yet implemented");
	}
	
	@Test
	void testTwo() {
		assertTrue(2+3==5);		
	}
	
	@Test
	void testThree() {
		assertEquals(2 + 3 , 5 , "something wrong");
	}*/

	@Test
	void testEven() {
		assertTrue(NumericChecks.isEven(20) , "should be even");
	}

	@Test
	void testOdd() {
		assertFalse(NumericChecks.isEven(21) , "should be false");
	}
	@Test
	void testAdd() {
		assertEquals(NumericChecks.sum(10,20),30, "should be equal");
	}

}
