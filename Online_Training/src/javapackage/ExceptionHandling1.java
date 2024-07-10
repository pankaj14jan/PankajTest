package javapackage;

public class ExceptionHandling1 {

	public static void main(String[] args) {

		try {
			int a = 5 / 0; // ArithmeticException
		} catch (ArithmeticException a) {
			a.printStackTrace(); // Give complete exception info
			System.out.println(a); // Give only exception info
		} catch (NullPointerException n) {
			System.out.println(n);
		} catch (ArrayIndexOutOfBoundsException b) {
			System.out.println(b);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Exception handled");
	}

}
