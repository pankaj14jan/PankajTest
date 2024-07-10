package javapackage;

public class Encapsulation1 {

	String name; //Global Variable
	int b; //Global variable
	final int c = 2; //Final variable
	
	public void a() {
		// c=5; //final variable can not change the value
	}
	
	//final method
	final void d() {
		System.out.println("final method");
	}
	
	public void SetName(String s) {
		this.name = s;
		this.b =5;
		System.out.println(b); 
		System.out.println(c);
	}
	public String getName() {
		return name;
		
	}
}
