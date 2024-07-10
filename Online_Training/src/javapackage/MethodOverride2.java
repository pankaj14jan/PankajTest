package javapackage;

public class MethodOverride2 extends MethodOverride1 {

	public void eat() {
		System.out.println("You are eating");
	}

	public static void main(String[] args) {

		MethodOverride2 mo2 = new MethodOverride2();
		mo2.eat(); // You are eating
	}
}

//if both methods are same, it will give preference to his own child method