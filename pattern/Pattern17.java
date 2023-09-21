package com.kodnest.assignment.pattern;

public class Pattern17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=n+i;k++) {
				if(i==1||k==1||k==n+i) {
					System.out.print("*");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
			n++;
		}
		
		for(int i=1;i<=4;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=4*2-(2*i-1);k++) {
				if(i==4||k==1||k==4*2-(2*i-1)) {
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
