//This is for swapping of two no 
package javaBasics_1;

import java.util.Scanner;

public class swapNo {

	public static void main(String[] args) {
		System.out.println("Enter two numbers: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Numbers Before swap: ");
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("Numbers After swap: ");
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("a=" + a);
		System.out.println("b=" + b);

	}

}
