package org.assignment.programs;

public class LoverMarriageEligibility {

	/**
	 * Write a JAVA program to check Lover's Age is eligible for Marriage or not
	 * 
	 * Girls Age Criteria : 18 Boys Age Criteria : 21
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		int boyAge = 20, girlAge = 17;
		if ((boyAge >= 21) && (girlAge >= 18))
			System.out.println("Both are Eligible");
		else if ((boyAge >= 21) && (girlAge < 18))
			System.out.println("Girl is Not Eligible because she lacks by " + (18 - girlAge) + " years");
		else if ((boyAge < 21) && (girlAge >= 18))
			System.out.println("Boy is Not Eligible because he lacks by " + (21 - boyAge) + " years");
		else {
			System.out.println("Both are Not Eligible for Marriage");
			System.out.println("Boy is Not Eligible because he lacks by " + (21 - boyAge) + " years");
			System.out.println("Girl is Not Eligible because she lacks by " + (18 - girlAge) + " years");
		}
	}
}
