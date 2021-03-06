package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import algorithms.HeapSort;

/**
 * A test-class for testing the HeapSort-class.
 * It tests that the class sorts right the given array.
 */
public class HeapSortTest {

	@Test
	public void testSort_randomOrder() {
		assertTrue(Checker.same(HeapSort.sort(new int[]{2,8,4,3}, 4), new int[]{2,3,4,8}));
	}
	
	@Test
	public void testSort_alreadyOrdered() {
		assertTrue(Checker.same(HeapSort.sort(new int[]{1,2,3,4}, 4), new int[]{1,2,3,4}));
	}
	
	@Test
	public void testSort_reverseOrder() {
		assertTrue(Checker.same(HeapSort.sort(new int[]{20,10,5,0}, 4), new int[]{0,5,10,20}));
	}
	
	@Test
	public void testSort_oneNumber() {
		assertTrue(Checker.same(HeapSort.sort(new int[]{1}, 1), new int[]{1}));
	}
	
	@Test
	public void testSort_empty() {
		assertTrue(Checker.same(HeapSort.sort(new int[]{}, 0), new int[]{}));
	}

}
