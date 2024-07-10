package javapackage;

public class Variable8 {

	int b = 10; // Global variable
	static int c = 5; // Static variable

	public static void d() {

		int e = 15; // Local Variable
		System.out.println(e); // 15
	}

	public void f() {

		int g = 5; // Local variable
		System.out.println(g);
	}

	public static void main(String[] args) {
		int a = 6; // Local Variable
		System.out.println(a); // 6

		//Static member calling
		
		System.out.println(c); //5
		d(); //15
		System.out.println(Variable8.c); //5 (this approach we follow, when want to call method in other class bcoz of static variable)
		Variable8.d();//15 (same way we can call d method also in other class, bcoz of static method)
		
		//Non Static member calling
		Variable8 V8 = new Variable8(); //Object creation of class
		System.out.println(V8.b); //10
		V8.f(); //5
		
		
		
	}

}
