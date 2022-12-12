package javaBasics_2;

import java.util.Arrays;
import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int size = sc.nextInt();
		int sum = 0, index = 0, key = 0;
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the values");
			arr[i] = sc.nextInt();
			sum = sum + arr[i];

		}
		Arrays.sort(arr); // predefined functions is used for sorting the entered array

		key = sum / size;

		for (int i = 0; i < size; i++) {
			if (arr[i] == key) {
				index = i;
				break;
			}
		}

		for (int j = index + 1; j < size; j++) {
			System.out.println(arr[j]);
		}
	}
}