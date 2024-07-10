package javapackage;

public class Inheritance7 extends Inheritance6{

	public void eat() {
		System.out.println("I am eating");
	}
	public static void main(String[] args) {
		
		Inheritance7 i7 = new Inheritance7();
		i7.read();
		i7.write();
		i7.eat();
	}
}

//Inheritance 7 will have 3 methods eat and  read, write (from Inheritance 6)