package com.Test;

public class Exceptions extends Exception {

	public String checkExceptions(double n1, double n2, char op) {
		double result = 0.0;
		try {

			result = this.calculate(n1, n2, op);

		} catch (DivideByeZero ex) {
			return ex.getMessage();

		}

		catch (MultipleByZero ex) {
			return ex.getMessage();

		} catch (Exception ex) {
			return ex.getMessage();

		}
		return "no exception found" + result;
	}

	public double calculate(double n1, double n2, char op) throws Exception {
		switch (op) {

		case '*':
			if ((n1 == 0 || n2 == 0)) {
				throw new MultipleByZero("Multiplication with zero results in zero");
			}
			return n1 * n2;
		case '/':
			if (n2 == 0) {
				throw new DivideByeZero("Division by zero results in infinity");
			}
			return n1 / n2;

		default:
			throw new Exception(op + "is not a valid operator");

		}

	}
}

class DivideByeZero extends Exception {

	public DivideByeZero(String s) {

		// call constructor
		super(s);
	}
}

class MultipleByZero extends Exception {

	public MultipleByZero(String s) {

		// call constructor
		super(s);
	}
}
