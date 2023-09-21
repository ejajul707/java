package com.kodnest.assignment.pattern;

public class Pattern23 {

	public static void main(String[] args) {
		int n=0;
		for(int i=1;i<=5;i++) {
			int s=1;
			for(int j=5;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i+n;k++) {
				if(i==1||k==1||k==i+n) {
					System.out.print(s++);
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
			n++;
			
		}
		for(int i=1;i<=4;i++) {
			int s=1;
			for(int j=0;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=4*2-(2*i-1);k++) {
				if(k==1||k==4*2-(2*i-1)) {
					System.out.print(s++);
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
