package org.assignment.programs;

public class SeasonEligibilityByMonthNum {

	/**
	 * Write a JAVA program to print season in a year based on Month Number
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		int monthNum = 9;

		switch (monthNum) {
		case 3:
		case 4:
		case 5:
			System.out.println("Summer Season..!!");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("Rainy Season..!!");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("Spring Season..!!");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("Winter Season..!!");
			break;
		default:
			System.out.println("Invalid Month Number..!!");
		}
	}
}
