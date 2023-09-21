package com.kodnest.assignment.pattern;

public class Pattern25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=5;i++) {
			char ch='A';
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=5*2-(2*i-1);k++) {
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}

	}

}
