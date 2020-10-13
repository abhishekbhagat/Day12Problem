package com.bridgelabz.problemDay13;

public class TestMaximum {
	public  static Integer maximumNumber(Integer a, Integer b, Integer c) {
		Integer max = 0;
		if (a.compareTo(b) > 0)
			max = a;
		else
			max = b;
		if (max.compareTo(c) < 0)
			max = c;
		printMax(max);
		return max;
	}

	public static void printMax(Integer max) {
		System.out.println("Maximum number =  " + max);
	}

	public static void main(String[] args) {
		Integer a = 45, b = 15, c = 35;
		maximumNumber(a, b, c);
	}
}
