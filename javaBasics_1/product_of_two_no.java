//This is for finding the product of two no
package javaBasics_1;

import java.util.Scanner;

public class product_of_two_no {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two Numners: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		product(a, b);

	}

	public static void product(int x, int y) {
		System.out.println("product of two numbers is: " + (x * y));
	}
}
