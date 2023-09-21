package com.kodnest.assignment.pattern;

public class Pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=5*2-(2*i-1);k++) {
				if(i==1||i==5||k==1||k==5*2-(2*i-1)) {
				System.out.print("*");
			}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
