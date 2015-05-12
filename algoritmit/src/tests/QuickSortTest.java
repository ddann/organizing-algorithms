package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import algorithms.QuickSort;

/**
 * A test-class for testing the QuickSort-class.
 * It tests that the class sorts right the given array.
 * It cannot test an empty array as an input as the algorithm doesn't work with one.
 */
public class QuickSortTest {

	@Test
	public void testSort_randomOrder() {
		assertTrue(Checker.same(QuickSort.sort(new int[]{2,8,4,3}, 1, 4), new int[]{2,3,4,8}));
	}
	
	@Test
	public void testSort_alreadyOrdered() {
		assertTrue(Checker.same(QuickSort.sort(new int[]{1,2,3,4}, 1, 4 ), new int[]{1,2,3,4}));
	}
	
	@Test
	public void testSort_reverseOrder() {
		assertTrue(Checker.same(QuickSort.sort(new int[]{20,10,5,0}, 1, 4), new int[]{0,5,10,20}));
	}
	
	@Test
	public void testSort_oneNumber() {
		assertTrue(Checker.same(QuickSort.sort(new int[]{1}, 1, 1), new int[]{1}));
	}

}
