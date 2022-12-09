//This is for conversion of inches to meter
package javaBasics_1;

import java.util.Scanner;

public class conversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the data in inches: ");
		float a = sc.nextFloat();
		System.out.println("inches to meter conversion:" + (a / 39.37));
	}

}
