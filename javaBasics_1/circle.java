//This for calculating the dimension  of circle
package javaBasics_1;

import java.util.Scanner;

public class circle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the Radius of Circle: ");
		float r = sc.nextFloat();
		circle c1 = new circle();
		c1.Area(r);
		c1.Perimeter(r);
	}

	void Area(float x) {
		System.out.println("Area of the circle is:" + (3.14 * x * x));
	}

	void Perimeter(float y) {
		System.out.println("Area of the Perimeter is:" + (2 * 3.14 * y));

	}

}
