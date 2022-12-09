//This is for finding greater of three no
package javaBasics_1;

import java.util.Scanner;

public class greaterNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if (a > b) {
			if (a > c)
				System.out.println("Greater no is: " + a);
			else
				System.out.println("Greater no is" + c);
		} else {
			if (b > c)
				System.out.println("Greater no is:" + b);
			else
				System.out.println("Greater no is:" + c);
		}
	}

}
