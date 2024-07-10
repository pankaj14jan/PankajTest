package javapackage;

public class Inheritance2 extends Inheritance1{

	String name ="Selenium"; //Global variable
	
	public static void main(String[] args) {
	
		Inheritance2 i2 = new Inheritance2();
		
		System.out.println(i2.name); //Selenium
		
		/*Inheritance1 i1 = new Inheritance1();
		System.out.println(i1.roll);*/ //5  //Without Inheritance
		
		System.out.println(i2.roll); //5
		System.out.println(i2.a);
	}

}
