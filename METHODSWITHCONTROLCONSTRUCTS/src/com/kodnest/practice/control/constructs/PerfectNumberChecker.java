package com.kodnest.practice.control.constructs;

import java.util.Scanner;

public class PerfectNumberChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number: ");
		int num = sc.nextInt();
		int res=PerfectNumberChecker.checker(num);
		if(res>0) 
			System.out.println(num+" is a perfect number");
		else
			System.out.println(num+" is not a perfect number");
		

	}
	static int checker(int num) {
		int sum=0;
		for(int i=1;i<=num/2;i++) {
			if(num%i==0) {
				sum+=i;
			}
		}
		if(num==sum) {
			return sum;
		}
		else {
			return -1;
		}
	}

}
