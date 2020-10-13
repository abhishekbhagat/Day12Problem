package com.bridgelabz.problemDay13;

public  class TestMaximum<T extends Comparable<T>> {
	private T firstNumber;
	private T secondNumber;
	private T thirdNumber;
	
	public TestMaximum (T fistNumber, T secondNumber, T thirdNumber) {
		super();
		this.firstNumber = fistNumber;
		this.secondNumber = secondNumber;
		this.thirdNumber = thirdNumber;
	}
	public <T extends Comparable<T>> T testMaximum() {
		T max ;
		if (firstNumber.compareTo(secondNumber) > 0)
			max = (T) firstNumber;
		else
			max = (T) secondNumber;
		if (max.compareTo((T) thirdNumber) < 0)
			max = (T) thirdNumber;

		return max;
	}

	public static void main(String[] args) {
		Integer a = 80, b = 15, c = 35;
		Float firstNumber = 110f, secondNumber = 98f, thirdNumber = 87f;
		String firstString = "abhishek", secondString = "rahul", thirdString = "abhineet";
		System.out.println(new TestMaximum(a, b, c).testMaximum());
		System.out.println(new TestMaximum(firstNumber, secondNumber, thirdNumber).testMaximum());
		System.out.println(new TestMaximum(firstString, secondString, thirdString).testMaximum());
	}
}
