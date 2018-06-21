package org.assignment.programs;

public class DLElgibility {

	/**
	 * Write a Java Program whether the given age is eligible for Driving Licence
	 * (DL) or not
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		int age = 6;
		if (age >= 16 && age < 18)
			System.out.println("Eligible for Learner License Registration (LLR)");
		else if (age >= 18)
			System.out.println("Eligible for Normal Driving Licence");
		else
			System.out.println("Not Eligible you are lacking by " + (18 - age) + " years ");
	}

}
