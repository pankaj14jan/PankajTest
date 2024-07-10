package javapackage;

public class IfElse4 {

	public static void main(String[] args) {

		int age = 25; // Local variable
		int weight = 45; // Local variable

		// Outer if block
		if (age > 18) {

			// Inner If block
			if (weight > 50) {

				System.out.println("Eligible");
			}
			else {
				System.out.println("Not Eligible");
			}

		}
		else {
			System.out.println("Age is not greater than 18");
		}

	}

}
