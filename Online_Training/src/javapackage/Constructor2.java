package javapackage;

public class Constructor2 {

	int id; // global variable
	String name;// Global variable
	String address; // Global variable

	// Default Constructor
	Constructor2() {
		System.out.println("Hello Default Constructor");
	}

	// Parameterized constructor
	Constructor2(int a, String b, String c) {
		this.id = a;
		name = b;
		address = c;
	}
	//Nonstatic method
	public void displayInfo() {
		System.out.println(id + " " + name + " " + address + " ");
	} 
	public static void main(String[] args) {
		//default Constructor
		Constructor2 c2 =new Constructor2();
		
		//parameterized constructor
		Constructor2 c3 = new Constructor2(1, "John", "London");
		c3.displayInfo();
		
		Constructor2 c4 = new Constructor2(2, "Alex", "NewYork");
		c4.displayInfo();
	}
	
}
