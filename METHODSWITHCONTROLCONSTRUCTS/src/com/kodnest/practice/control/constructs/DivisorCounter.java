package com.kodnest.practice.control.constructs;

import java.util.Scanner;

public class DivisorCounter {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number: ");
		int n = sc.nextInt();
		DivisorCounter.divcont(n);
		

	}

	static void divcont(int n) {
		System.out.println("The divisor are: ");
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.print(i+" ");
			}

		}
		
	}
}
