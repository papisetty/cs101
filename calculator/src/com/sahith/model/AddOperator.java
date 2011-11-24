package com.sahith.model;

public class AddOperator extends Operator {

	public AddOperator(double first, double second) {
		super(first, second);
	}

	public String compute() {
		double result = getFirst() + getSecond();
		return String.valueOf(result);
	}

}
