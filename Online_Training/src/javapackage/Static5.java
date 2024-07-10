package javapackage;

public class Static5 {

	static int z = 5; // static variable
	int y = 1; // global variable

	// static method

	public static void a() {
		z = 10;
		System.out.println(z); // 10
	}
	// nonstatic method

	public void b() {
		z = 15;
		System.out.println(z);//15
		a();
	}
	
	public static void main(String[] args) {
		a();
		Static5 s5 = new Static5();
		s5.b();
	}
}
