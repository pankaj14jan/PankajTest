package javapackage;

public class BreakStatement1 {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {

			// if statement
			if (i == 3) {
				break; // break loop
			}
			System.out.println(i);
		}
		System.out.println("Control Came out of loop");
	}

}
