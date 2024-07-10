package javapackage;

public class Inheritance4 extends Inheritance3 {

	public void Multiply(int x, int y) {

		z = x * y;
		System.out.println("Product is : " + z);
	}

	public static void main(String[] args) {

		int x = 20, y=10;
		
		Inheritance4 i4 = new Inheritance4();
		i4.add(x, y); //30
		i4.Subtract(20, 15); //5
		i4.Multiply(x, y);//200
		
	}

}
