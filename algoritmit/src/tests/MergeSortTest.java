package tests;

import static org.junit.Assert.*;


import org.junit.Test;

import algorithms.MergeSort;

public class MergeSortTest {

	@Test
	public void testSort_randomOrder() {
		assertTrue(Checker.same(MergeSort.sort(new int[]{2,8,4,3}), new int[]{2,3,4,8}));
	}
	
	@Test
	public void testSort_alreadyOrdered() {
		assertTrue(Checker.same(MergeSort.sort(new int[]{1,2,3,4}), new int[]{1,2,3,4}));
	}
	
	@Test
	public void testSort_oneNumber() {
		assertTrue(Checker.same(MergeSort.sort(new int[]{1}), new int[]{1}));
	}
	
	@Test
	public void testSort_empty() {
		assertTrue(Checker.same(MergeSort.sort(new int[]{}), new int[]{}));
	}

}