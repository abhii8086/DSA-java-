package javaBasics_2;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int f = 1;
		for (int i = 1; i <= n; i++) {
			f = f * i;
		}
		System.out.println("factorial of the number " + n + " is:" + f);

	}

}
