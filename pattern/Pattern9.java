package com.kodnest.assignment.pattern;

public class Pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				
				System.out.print(" ");
			}
			for(int k=5;k>=i;k--) {
			System.out.print(k+" ");
			}
			System.out.println();
		}
		
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				
				System.out.print(" ");
			}
			for(int k=5;k>5-i;k--) {
			System.out.print(k+" ");
			}
			System.out.println();
		}
	}

}
