package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import algorithms.QuickSort;

public class QuickSortTest {

	@Test
	public void testSort1() {
		assertTrue(Checker.same(QuickSort.sort(new int[]{2,8,4,3}, 1, 4), new int[]{2,3,4,8}));
	}
	
	@Test
	public void testSort2() {
		assertTrue(Checker.same(QuickSort.sort(new int[]{1,2,3,4}, 1, 4 ), new int[]{1,2,3,4}));
	}
	
	@Test
	public void testSort3() {
		assertTrue(Checker.same(QuickSort.sort(new int[]{1}, 1, 1), new int[]{1}));
	}

}
