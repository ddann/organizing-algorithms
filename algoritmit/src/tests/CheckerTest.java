package tests;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * A test-class for testing the checker-class.
 * It tests whether the class can difference whether arrays are equal or not.
 */
public class CheckerTest {

	@Test
	public void testSame_notEqual() {
		assertTrue(!Checker.same(new int[]{2,8,4,3}, new int[]{2,3,4,8}));
	}
	
	@Test
	public void testSame_equal() {
		assertTrue(Checker.same(new int[]{2,5,6,9}, new int[]{2,5,6,9}));
	}
	
	@Test
	public void testSame_differentSize() {
		assertTrue(!Checker.same(new int[]{2,3,4}, new int[]{2,3,4,8}));
	}

}
