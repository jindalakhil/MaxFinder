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
	public void test_When_1_Is_Mazimum() {
		Integer a =15;
		assertEquals(a,maxfinder.findMax(15,7,6));
	}
	
	@Test
	public void test_When_2_Is_Mazimum() {
		Integer a =15;
		assertEquals(a,maxfinder.findMax(7,15,6));
	}
	@Test
	public void test_When_3_Is_Mazimum() {
		Integer a =15;
		assertEquals(a,maxfinder.findMax(7,6,15));
	}
	
	@Test
	public void test_When_1_Float_Is_Mazimum() {
		Float a =15.23f;
		assertEquals(a,maxfinder.findMax(15.23f,7.123f,15.15f));
	}
	
	@Test
	public void test_When_2_Float_Is_Mazimum() {
		Float a =15.23f;
		assertEquals(a,maxfinder.findMax(15.1f,15.23f,7.23f));
	}
	@Test
	public void test_When_3_Float_Is_Mazimum() {
		Float a =15.23f;
		assertEquals(a,maxfinder.findMax(15.1f,7.123f,15.23f));
	}
	
	@Test
	public void test_When_1_String_Is_Mazimum() {
		String a ="Kumar";
		assertEquals(a,maxfinder.findMax("Kumar", "Jindal", "Akhil"));
	}
	
	@Test
	public void test_When_2_String_Is_Mazimum() {
		String a ="Kumar";
		assertEquals(a,maxfinder.findMax("Akhil", "Kumar", "Jindal"));
	}
	@Test
	public void test_When_3_String_Is_Mazimum() {
		String a ="Kumar";
		assertEquals(a,maxfinder.findMax("Akhil", "Jindal", "Kumar"));
	}
	
}