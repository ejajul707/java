package com.kodnest.assignment.pattern;

public class Pattern24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		
		for(int i=1;i<=5;i++) {
			char ch='A';
			for(int j=5;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i+n;k++) {
				
				System.out.print(ch);
				ch++;
			}
			System.out.println();
			n++;
			
		}

	}

}
