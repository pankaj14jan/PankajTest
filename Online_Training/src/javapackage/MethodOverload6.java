package javapackage;

public class MethodOverload6 {

	public static void main(String[] args) {

		System.out.println(MethodOverload5.add(10, 5)); //Static methods can be called with the help of class name, we can call methods w/o extends because of static methods
		System.out.println(MethodOverload5.add(10.5, 5.5));
		
		//Print A to Z
		for(char c = 'A'; c<='Z'; c++) {
			System.out.print(c + " ");
		}

	}

}
