package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import algorithms.BubbleSort;

public class BubbleSortTest {
	
	@Test
	public void testSort1() {
		assertTrue(Checker.same(BubbleSort.sort(new int[]{2,8,4,3}), new int[]{2,3,4,8}));
	}
	
	@Test
	public void testSort2() {
		assertTrue(Checker.same(BubbleSort.sort(new int[]{1,2,3,4}), new int[]{1,2,3,4}));
	}
	
	@Test
	public void testSort3() {
		assertTrue(Checker.same(BubbleSort.sort(new int[]{1}), new int[]{1}));
	}

}
