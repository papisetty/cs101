package com.sahith.model;

public class Operator {
	private double firstNum = 0;
	private double secondNum = 0;

	public Operator(double first, double second) {
		firstNum = first;
		secondNum = second;
	}

	public double getFirst() {
		return firstNum;
	}

	public double getSecond() {
		return secondNum;
	}

	public String compute() {
		return "Not implemented. Sub class should do";
	}
}
