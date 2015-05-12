package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import algorithms.IntroSort;

/**
 * A test-class for testing the IntroSort-class.
 * It tests that the class sorts right the given array.
 * It cannot test an empty array as an input as the algorithm doesn't work with one. (Due to Quicksort.)
 */
public class IntroSortTest {

	@Test
	public void testSort_randomOrder() {
		assertTrue(Checker.same(IntroSort.sort(new int[]{2,8,4,3}), new int[]{2,3,4,8}));
	}
	
	@Test
	public void testSort_alreadyOrdered() {
		assertTrue(Checker.same(IntroSort.sort(new int[]{1,2,3,4}), new int[]{1,2,3,4}));
	}
	
	@Test
	public void testSort_reverseOrder() {
		assertTrue(Checker.same(IntroSort.sort(new int[]{20,10,5,0}), new int[]{0,5,10,20}));
	}
	
	@Test
	public void testSort_oneNumber() {
		assertTrue(Checker.same(IntroSort.sort(new int[]{1}), new int[]{1}));
	}
	

}
