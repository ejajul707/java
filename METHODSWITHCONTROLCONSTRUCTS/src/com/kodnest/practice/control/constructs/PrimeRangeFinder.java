package com.kodnest.practice.control.constructs;

import java.util.Scanner;

public class PrimeRangeFinder {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number: ");
		int n = sc.nextInt();
		PrimeRangeFinder.prime(n);
		
		
	}
	static void prime(int n) {
		int count=0;
		for (int i = 2; i <=n; i++) {
			for (int j = 2; j <=i-1; j++) {
				if(i%j==0) {
					count=count+1;
				}
			}
			if(count==0) {
				System.out.println(i);
			}
			else {
				count=0;
			}
		}
		
}
}
