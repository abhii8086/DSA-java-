package javaBasics_2;

import java.util.Scanner;

public class leftside0andRightside1 {

	public static void main(String[] args) {
		System.out.println("Enter the size of Array: ");

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int array[] = new int[size];
		System.out.println("Enter the values");
		for (int i = 0; i < size; i++) {
			int x = sc.nextInt();
			if (x == 0 || x == 1) {
				array[i] = x;
			} else {
				System.out.println("Error");
			}
		}
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (array[i] > array[j]) {
					array[i] = array[i] + array[j];
					array[j] = array[i] - array[j];
					array[i] = array[i] - array[j];
				}
			}
		}

		for (int i = 0; i < size; i++) {
			System.out.print(array[i]);
		}

	}
}
