package javapackage;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {

		// Creating ArrayList

		ArrayList<Object> obj = new ArrayList<Object>();

		// Adding Object in ArrayList
		obj.add(1);
		obj.add("Selenium");
		obj.add(7.0);
		obj.add('a');
		obj.add(3 > 12);

		// Print ArrayList element - 1st Way
		System.out.println(obj);

		System.out.println();
		System.out.println();

		// Print ArrayList element - 2nd Way
		Iterator abc = obj.iterator();
		while (abc.hasNext()) {
			System.out.println("Using while loop : " + abc.next());
		}
		System.out.println();
		System.out.println();
		// Print ArrayList element - 3rd Way
		for (Object bcd : obj) {
			System.out.println("Using for each loop : " + bcd);
		}
	}

}
