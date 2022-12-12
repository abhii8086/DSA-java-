package javaBasics_2;

import java.util.Scanner;

public class arrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array: ");
		int size = sc.nextInt();
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();

		}
		for (int i = 0; i < size; i++) { // logic to swap an array using for loop
			for (int j = i + 1; j < size; j++) {
				if (array[i] > array[j]) {
					array[i] = array[i] + array[j];
					array[j] = array[i] - array[j];
					array[i] = array[i] - array[j];
				}
			}
		}

		for (int i = 0; i < size; i++) {
			System.out.print(" " + array[i]);
		}
	}

}
