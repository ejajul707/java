package com.kodnest.practice.control.constructs;

import java.util.Scanner;

public class FactorialSum {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number: ");
		int n=sc.nextInt();
		int res=FactorialSum.factorial(n);
		System.out.println("The factorial of "+n+" is : "+res);
		
		
	}


	 static int factorial(int n) {
		 int fact=1;
		for(int i=1;i<=n;i++) {
			fact*=i;
		}
		return fact;
		
	}
}

