package javapackage;

public class Static4 {

	public static void main(String[] args) {

		Static3 s3 = new Static3(1, "John");
		Static3 s4 = new Static3(2, "Peter");
		Static3 s5 = new Static3(3, "Alex");

		s3.getResult();
		s4.getResult();
		s5.getResult();
	}
}
