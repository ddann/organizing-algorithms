package tests;

import static org.junit.Assert.*;
import org.junit.Test;

public class CheckerTest {

	@Test
	public void testSame1() {
		assertTrue(!Checker.same(new int[]{2,8,4,3}, new int[]{2,3,4,8}));
	}
	
	@Test
	public void testSame2() {
		assertTrue(Checker.same(new int[]{2,5,6,9}, new int[]{2,5,6,9}));
	}
	
	@Test
	public void testSame3() {
		assertTrue(!Checker.same(new int[]{2,3,4}, new int[]{2,3,4,8}));
	}

}
