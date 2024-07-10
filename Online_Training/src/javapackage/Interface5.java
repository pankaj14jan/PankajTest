package javapackage;

public class Interface5 extends Inheritance1 implements Interface3, Interface4 {

	public void b() {
		System.out.println("b method");
	}

	public void a() {
		System.out.println("a method");
	}

	public static void main(String[] args) {
		Interface5 i5 = new Interface5();
		i5.a(); //a method
		i5.b(); //b method
		System.out.println(i5.roll); //5
	}
}
