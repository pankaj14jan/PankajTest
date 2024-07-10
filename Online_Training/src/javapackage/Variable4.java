package javapackage;

public class Variable4 {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5 }; // int type array

		String b[] = { "John", "Peter" }; // String type array

		System.out.println(a[2]);
		System.out.println(b[0]);
		// System.out.println(b[3]); //out of bound exception

		Object c[] = { 1, 2, 3, "John", "Peter", 'a', 'b', 3 > 12 }; // Object Array
		System.out.println(c[3]);
		System.out.println(c[0]);
		System.out.println(c[7]);
	}

}
