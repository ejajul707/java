package com.kodnest.assignment.pattern;

public class Pattern22 {

	public static void main(String[] args) {
		int n=0;
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i+n;k++) {
				System.out.print(k);
			}
			System.out.println();
			n++;
		}
		for(int i=1;i<=4;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=4*2-(2*i-1);k++) {
				System.out.print(k);
			}
			System.out.println();
		}

	}

}
