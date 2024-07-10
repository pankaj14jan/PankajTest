package javapackage;

public class Array4 {

	public static void main(String[] args) {

		// Defining Multidimensional Array
		int a[][] = { { 1, 2, 3, 7 }, { 4, 5, 6, 8 }, { 7, 8, 9, 6 } };

		// Total number of rows
		int row = a.length; // Length is the prperty of an array
		System.out.println("Total Rows :" + row);

		// Total number of Columns
		int columns = a[0].length; // Length is the prperty of an array
		System.out.println("Total Columns :" + columns);

		// Print all data matrix
		// Outer loop
		for (int i = 0; i < row; i++) {

			// Inner loop
			for (int j = 0; j < columns; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

}
