package javapackage;

public class BreakStatement4 {

	public static void main(String[] args) {

		int i = 1;// Local Variable

		//do while loop
		do {
			if (i == 3) {
				break;
			}
			System.out.println(i);
			i++;
		} while (i <= 5);

	}

}
