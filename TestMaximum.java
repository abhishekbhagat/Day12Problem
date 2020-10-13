package com.bridgelabz.problemDay13;

public class TestMaximum {
	/**
	 * uc1
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public static Integer maximumNumber_WhenInput_IsInteger(Integer a, Integer b, Integer c) {
		Integer max = 0;
		if (a.compareTo(b) > 0)
			max = a;
		else
			max = b;
		if (max.compareTo(c) < 0)
			max = c;
		return max;
	}

	/**
	 * uc2
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public static Float maximumNumber_WhenInput_IsFloat(Float a, Float b, Float c) {
		Float max;
		if (a.compareTo(b) > 0)
			max = a;
		else
			max = b;
		if (max.compareTo(c) < 0)
			max = c;
		return max;
	}
	/**
	 * uc3
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public static String stringWhocome_Last_Inlexicographically(String a, String b, String c) {
		String max;
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
		String firstString="abhishek",secondString="rahul",thirdString="abhineet";
		System.out.println(maximumNumber_WhenInput_IsInteger(a, b, c));
		System.out.println(maximumNumber_WhenInput_IsFloat(firstNumber, secondNumber, thirdNumber));
		System.out.println(stringWhocome_Last_Inlexicographically(firstString,secondString,thirdString));
	}
}
