package com.capg;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MaxFinderTester {
	MaxFinder maxfinder;
	
	@Before
	public void before() {
		maxfinder=new MaxFinder();
	}

	@Test
	public void test_When_1_Is_Maximum() {
		Integer a =15;
		assertEquals(a,maxfinder.findMax(15,7,6));
	}
	
	@Test
	public void test_When_2_Is_Maximum() {
		Integer a =15;
		assertEquals(a,maxfinder.findMax(7,15,6));
	}
	@Test
	public void test_When_3_Is_Maximum() {
		Integer a =15;
		assertEquals(a,maxfinder.findMax(7,6,15));
	}
	
}