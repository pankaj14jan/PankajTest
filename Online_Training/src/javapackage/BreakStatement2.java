package javapackage;

public class BreakStatement2 {

	public static void main(String[] args) {

		// Outer Loop
		for (int i = 1; i < 3; i++) {

			// inner Loop
			for (int j = 1; j < 3; j++) {

				// If Statement
				if (i == 2 && j == 2) {
					break;
				}
				System.out.println(i + " " + j);
			}
			System.out.println("Control came out of inner loop");

		}
		System.out.println("Control came out of Outer loop");

	}

}
