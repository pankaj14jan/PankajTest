package javapackage;

public class Static3 {

	int roll; // Declaring global variable
	String name; // Declaring global variable
	static String college = "IIT Mumbai"; // static variable

	// Constructor -constructor name will be same as class name
	Static3(int r, String n) {
		roll = r;
		name = n;

	}
	public void getResult() {
		
		System.out.println(roll + " " + name + " " + college);
	}

}
