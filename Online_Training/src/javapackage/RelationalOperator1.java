package javapackage;

public class RelationalOperator1 {

	public static void main(String[] args) {

		int a = 300; // Local variable
		int b = 300; // Local variable

		// Number comparison by if else statement
		if (a != b) {
			System.out.println("a is not eqal to b");
		} else {
			System.out.println("a is equal to b");
		}

		String p = "HELLO";
		String q = "hello";

		// String Comparison - 1st way - case sensitive
		if (p == q) {
			System.out.println("p and q are equal in 1st way");
		} else {
			System.out.println("p and q are not equal in 1st way");
		}

		// String Comparison - 2nd way - case sensitive
		if (p.equals(q)) {
			System.out.println("p and q are equal in 2nd way");
		} else {
			System.out.println("p and q are not equal in 2nd way");
		}
		// String Comparison - 3rd way - Non case sensitive
		if (p.equalsIgnoreCase(q)) {
			System.out.println("p and q are equal in 3rd way");
		} else {
			System.out.println("p and q are not equal in 3rd way");
		}

	}
}
