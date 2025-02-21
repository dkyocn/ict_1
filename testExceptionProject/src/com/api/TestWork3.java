package com.api;

import exception.silsub1.NumberRangeException;
import make.exception.NotDivideZeroException;

public class TestWork3 {
	private static Calculator calculator = new Calculator();

	public static void testInteger() {

		try {
			calculator.sum(13, 24);
			calculator.sub(14, 35);
			calculator.mul(34, 15);
			calculator.div(15, 46);
		} catch (NumberRangeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotDivideZeroException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void testDouble() {

		try {
			calculator.sum(13.12, 24.14);
			calculator.sub(14.4, 35.25);
			calculator.mul(34.6, 15.46);
			calculator.div(15.7, 46.7);
		} catch (NumberRangeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotDivideZeroException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
