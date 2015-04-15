package tests;

import static org.junit.Assert.*;


import org.junit.Test;

import algorithms.HeapSort;

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
	public void testSort_oneNumber() {
		assertTrue(Checker.same(HeapSort.sort(new int[]{1}, 1), new int[]{1}));
	}
	
	@Test
	public void testSort_empty() {
		assertTrue(Checker.same(HeapSort.sort(new int[]{}, 0), new int[]{}));
	}

}
