package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import algorithms.SelectionSort;

public class SelectionSortTest {

	@Test
	public void testSort_randomOrder() {
		assertTrue(Checker.same(SelectionSort.sort(new int[]{2,8,4,3}), new int[]{2,3,4,8}));
	}
	
	@Test
	public void testSort_alreadyOrdered() {
		assertTrue(Checker.same(SelectionSort.sort(new int[]{1,2,3,4}), new int[]{1,2,3,4}));
	}
	
	@Test
	public void testSort_reverseOrder() {
		assertTrue(Checker.same(SelectionSort.sort(new int[]{20,10,5,0}), new int[]{0,5,10,20}));
	}
	
	@Test
	public void testSort_oneNumber() {
		assertTrue(Checker.same(SelectionSort.sort(new int[]{1}), new int[]{1}));
	}
	
	@Test
	public void testSort_empty() {
		assertTrue(Checker.same(SelectionSort.sort(new int[]{}), new int[]{}));
	}

}
