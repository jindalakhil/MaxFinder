package com.capg;

public class MaxFinder {
	public static void main(String[] args) {
		
	}
	public static Integer findMax(Integer a, Integer b, Integer c) {
		Integer max = a;
		
		if(b.compareTo(max)>0)
			max = b;
		if(c.compareTo(max)>0)
			max = c;
		return max;
	}
}
