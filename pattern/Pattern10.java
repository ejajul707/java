package com.kodnest.assignment.pattern;

public class Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i+n;k++) {
				if(i==1||i==5||k==1||k==i+n) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
			n++;
		}
	}

}
