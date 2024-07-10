package javapackage;

public class Array1 {

	public static void main(String[] args) {
		
		//Defining an Array
		int a[] = new int [5];
		
		//Printing length of an Array
		System.out.println(a.length);
		
		//Print default value of an int Array
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
			
		}
		//Assigning Value to an Array
		a[0] = 65;
		a[1] = 99;
		a[2] = 5;
		a[3] = 10;
		a[4] = 78;
		//a[5] =90; //java.lang.ArrayIndexOutOfBoundsException
		
		//Print all array elements
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
			
		}
	}

}
