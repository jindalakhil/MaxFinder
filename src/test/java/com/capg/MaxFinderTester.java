package com.capg;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MaxFinderTester {
	MaxFinder maxfinder;

	@Test
	public void test_When_1_Is_Mazimum() {
		maxfinder = new MaxFinder<Integer>(15, 7, 6);
		Integer a =15;
		assertEquals(a,maxfinder.findMax());
	}
	
	@Test
	public void test_When_2_Is_Mazimum() {
		maxfinder = new MaxFinder<Integer>(7, 15, 6);
		Integer a =15;
		assertEquals(a,maxfinder.findMax());
	}
	@Test
	public void test_When_3_Is_Mazimum() {
		maxfinder = new MaxFinder<Integer>(11, 7, 15);
		Integer a =15;
		assertEquals(a,maxfinder.findMax());
	}
	
	@Test
	public void test_When_1_Float_Is_Mazimum() {
		maxfinder = new MaxFinder<Float>(15.23f,7.123f,15.15f);
		Float a =15.23f;
		assertEquals(a,maxfinder.findMax());
	}

	@Test
	public void test_When_2_Float_Is_Mazimum() {
		maxfinder = new MaxFinder<Float>(15.1f,15.23f,15.15f);
		Float a =15.23f;
		assertEquals(a,maxfinder.findMax());
	}
	@Test
	public void test_When_3_Float_Is_Mazimum() {
		maxfinder = new MaxFinder<Float>(15.2f,7.123f,15.23f);
		Float a =15.23f;
		assertEquals(a,maxfinder.findMax());
	}
	
	@Test
	public void test_When_1_String_Is_Mazimum() {
		maxfinder = new MaxFinder<String>("Kumar", "Jindal", "Akhil");
		String a ="Kumar";
		assertEquals(a,maxfinder.findMax());
	}
	
	@Test
	public void test_When_2_String_Is_Mazimum() {
		maxfinder = new MaxFinder<String>("Akhil", "Kumar", "Jindal");
		String a ="Kumar";
		assertEquals(a,maxfinder.findMax());
	}
	@Test
	public void test_When_3_String_Is_Mazimum() {
		maxfinder = new MaxFinder<String>("Akhil", "Jindal", "Kumar");
		String a ="Kumar";
		assertEquals(a,maxfinder.findMax());
	}
	
}