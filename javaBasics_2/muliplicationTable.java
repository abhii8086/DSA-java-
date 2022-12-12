package javaBasics_2;

import java.util.Scanner;

public class muliplicationTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no to print its table: ");
		int number = sc.nextInt();
		int m;
		for (int i = 1; i <= 10; i++) {
			m = number * i;
			System.out.println(m);
		}
	}

}
