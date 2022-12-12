package javaBasics_2;

import java.util.Scanner;

public class arraySum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array: ");
		int size = sc.nextInt();
		int[] array = new int[size];
		int sum = 0;
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
			sum = sum + array[i];
		}
		System.out.println("Sum is: " + sum);

	}

}
