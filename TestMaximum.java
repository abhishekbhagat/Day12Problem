package com.bridgelabz.problemDay13;

public class TestMaximum {
	public static <T extends Comparable<T>> T testMaximum(T a, T b, T c) {
		T max;
		if (a.compareTo(b) > 0)
			max = a;
		else
			max = b;
		if (max.compareTo(c) < 0)
			max = c;

		return max;
	}

	public static void main(String[] args) {
		Integer a = 45, b = 15, c = 35;
		Float firstNumber = 110f, secondNumber = 98f, thirdNumber = 87f;
		String firstString = "abhishek", secondString = "rahul", thirdString = "abhineet";
		System.out.println(testMaximum(a, b, c));
		System.out.println(testMaximum(firstNumber, secondNumber, thirdNumber));
		System.out.println(testMaximum(firstString, secondString, thirdString));
	}
}
