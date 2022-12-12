package javaBasics_2;

import java.util.Scanner;

public class smallestof3No {

	public static void main(String[] args) {
		System.out.println("Enter three numbers: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if (a < b) {
			if (a < c)
				System.out.println("smallest number is a: " + a);
			else
				System.out.println("smallest number is c: " + c);
		} else {
			if (b < c)
				System.out.println("smallest number is b: " + b);
			else
				System.out.println("smallest number is c: " + c);
		}
	}

}
