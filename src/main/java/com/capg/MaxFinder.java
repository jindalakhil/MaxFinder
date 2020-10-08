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
	public static Integer findMax(Integer a, Integer b, Integer c) {
		Integer max = a;
		
		if(b.compareTo(max)>0)
			max = b;
		if(c.compareTo(max)>0)
			max = c;
		return max;
	}
	
	public static Float findMax(Float x,Float y,Float z) {
		Float max=x;
		if(y.compareTo(max)>0)
			max=y;
		if(z.compareTo(max)>0)
			max=z;
		return max;
	}
	
	public static String findMax(String a,String b,String c) {
		String max= a;
		if(b.compareTo(max)>0)
			max=new String(b);
		if(c.compareTo(max)>0)
			max=new String(c);
		return max;
	}
}
