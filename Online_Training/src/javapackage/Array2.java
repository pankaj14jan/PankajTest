package javapackage;

public class Array2 {

	public static void main(String[] args) {

		// we can write array in below fashion

		int b[] = { 1, 2, 3, 4, 5 }; //Defining an int array

		String s[] = { "Hi", "Hello" }; //Defining an String array

		Object a[] = { 1, 2, 3, 4, 5, "Selenium", 6, 6.5 }; //Defining an object array
		
		System.out.println(a.length); //8 -- length is property of array
		System.out.println(b.length); //5
		System.out.println(s.length); //2
		
		System.out.println(a[5]); //Selenium
		System.out.println(b[4]); //5
		System.out.println(s[1]); //Hello
		
		a[5] = "Automation"; //Modifying an array value using index
		System.out.println(a[5]); //Automation

	}

}
