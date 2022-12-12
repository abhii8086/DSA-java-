package javaBasics_2;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		System.out.println("Enter the total terms you want to print of fibonacci:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0, b = 1, c;
		if (n <= 1) {
			System.out.print(" " + a);

		} else if (n <= 2) {
			System.err.print(a + " " + b);
		} else
			System.err.print(a + " " + b);

		for (int i = 2; i < n; i++) {
			c = a + b;
			System.out.print(" " + c);
			a = b;
			b = c;
		}

	}

}
