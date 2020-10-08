package com.capg;

public class MaxFinder <t extends Comparable> {
	t var1;
	t var2;
	t var3;
	
	public MaxFinder(t var1, t var2, t var3) {
		super();
		this.var1 = var1;
		this.var2 = var2;
		this.var3 = var3;
	}
	public static void main(String[] args) {
		MaxFinder obj = new MaxFinder<Float>(2.0f, 1.0f, 2.12f);
		System.out.println("Maximum Value is "+ obj.findMax());
	}
	private static <T extends Comparable> T findMax(T a, T b, T c) {
		T max = a;
		
		if(b.compareTo(max)>0)
			max = b;
		if(c.compareTo(max)>0)
			max = c;
		return max;
	}
	
	public <t extends Comparable> t findMax() {
		return (t)findMax(var1,var2,var3);
	}
	
}
