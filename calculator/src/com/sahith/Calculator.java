package com.sahith;

import com.sahith.model.AddOperator;
import com.sahith.model.Operator;


public class Calculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double num1 = 0;
		double num2 = 0;
		String operator = "+";

		if (args.length < 2) {
			System.out
					.println("Calculator needs at least two arguments. Like x + y");
			return;
		}

		num1 = Double.parseDouble(args[0]);
		operator = args[1];
		num2 = Double.parseDouble(args[2]);

		Operator myOperator = null;
		if(operator.equals("+")){
			myOperator = new AddOperator(num1, num2);
		}
		
		String answer = myOperator.compute();
		System.out.println("result = " + answer);
	}

}
