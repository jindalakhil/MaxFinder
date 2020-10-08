package com.capg;

public class MaxFinder {
	public static void main(String[] args) {
		Integer a =1;
		Integer b= 2;
		Integer c =3;
		System.out.println("Maximum Integer is "+ findMax(a, b, c));
		Float x = 23.12f;
		Float y = 1231.123123f;
		Float z = 1312.1231f;
		System.out.println("Maximum Float Number is "+ findMax(x, y, z));
		String e = "akhil";
		String f = "jindal";
		String g = "name";
		System.out.println("Maximum String is "+ findMax(e, f, g));
	}
	public static <T extends Comparable> T findMax(T a, T b, T c) {
		T max = a;
		
		if(b.compareTo(max)>0)
			max = b;
		if(c.compareTo(max)>0)
			max = c;
		return max;
	}
}
