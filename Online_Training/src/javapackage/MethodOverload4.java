package javapackage;

public class MethodOverload4 extends MethodOverload3 {
	
	public static void main(String[] args) {
		
		System.out.println(add(10,5)); //15 - as this is a static method, we can call directly
		System.out.println(add(5,5,10)); //20
	}

}
