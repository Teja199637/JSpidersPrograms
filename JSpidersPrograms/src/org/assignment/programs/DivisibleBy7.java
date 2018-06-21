package org.assignment.programs;

public class DivisibleBy7 {
	
	/**
	 * Write a JAVA program to check whether the given number is divisible by 7.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		int num = 63;
		if (num % 7 == 0)
			System.out.println(num + " is divisble by 7");
		else
			System.out.println(num + " is not divisble by 7");

	}
}
