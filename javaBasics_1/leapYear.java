//This is for checking leap Year
package javaBasics_1;

import java.util.Scanner;

public class leapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Year: ");
		int a = sc.nextInt();
		if (a % 4 == 0)
			System.out.println("Year Is Leap Year");
		else
			System.out.println("Year Is Not a Leap Year");

	}

}
