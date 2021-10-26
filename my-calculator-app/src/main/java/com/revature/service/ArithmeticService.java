package com.revature.service;

public class ArithmeticService {

	public String doAddition(String number1String, String number2String) {
		double number1 = Double.parseDouble(number1String);
		double number2 = Double.parseDouble(number2String);

		double sum = number1 + number2;

		String result = "The sum of the numbers is " + sum;
		
		// return (result1, result2, result3, result4, result5);
		// String result = result1 + result2 + result3 + result4 + result5;
		//return result1;
		return result;
	}

	public String doSubtract(String number1String, String number2String) {
		double number1 = Double.parseDouble(number1String);
		double number2 = Double.parseDouble(number2String);

		double dif = number1 - number2;
		
		String result = "The difference of the numbers is " + dif;

		// return (result1, result2, result3, result4, result5);
		// String result = result1 + result2 + result3 + result4 + result5;
		//return result2;
		 return result;
	}

	public String doMultiply(String number1String, String number2String) {
		double number1 = Double.parseDouble(number1String);
		double number2 = Double.parseDouble(number2String);

		double pro = number1 * number2;

		String result = "The product of the numbers is " + pro;

		// return (result1, result2, result3, result4, result5);
		// String result = result1 + result2 + result3 + result4 + result5;
		//return result3;
		 return result;
	}

	public String doDivide(String number1String, String number2String) {
		double number1 = Double.parseDouble(number1String);
		double number2 = Double.parseDouble(number2String);

		double div = number1 / number2;


		String result = "The quotient of the numbers is " + div;
		

		// return (result1, result2, result3, result4, result5);
		// String result = result1 + result2 + result3 + result4 + result5;
		//return result4;
		 return result;
	}

}
