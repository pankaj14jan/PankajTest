package javapackage;

import java.util.Hashtable;

public class HashTable1 {

	public static void main(String[] args) {

		Hashtable<Integer, String> hm = new Hashtable<Integer, String>();
		hm.put(1, "Jan");
		hm.put(2, "Feb");
		hm.put(3, "March");

		System.out.println(hm.get(1)); //Jan
		System.out.println(hm.get(2)); //Feb
		System.out.println(hm.get(3)); //March
	}

}
