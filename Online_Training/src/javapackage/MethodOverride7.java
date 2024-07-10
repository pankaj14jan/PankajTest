package javapackage;

public class MethodOverride7 {

	public static void main(String[] args) {
	
		MethodOverride5 mo5 = new MethodOverride6(); //passing reference of Parent class & creating object of child class
		
		mo5.Cook();
		mo5.Eat();
		mo5.HandWash();
		//mo5.angry() //Undefined - Dynamic Method dispatch

	}

}
