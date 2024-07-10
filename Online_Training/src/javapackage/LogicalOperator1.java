package javapackage;

public class LogicalOperator1 {

	public static void main(String[] args) {
		
		int a = 10; //Local Variable
		int b = 5; //Local variable
		int c = 11; //Local variable
		
		//Logical Operator
		System.out.println(a < b && a++ < c); // false
		System.out.println(a); //10
		
		//Bitwise Operator
		System.out.println(a > b & a++ < c); // True
		System.out.println(a); //11

	}

}
