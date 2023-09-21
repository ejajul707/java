package com.method.with.oprators;

import java.util.Scanner;

public class BitwiseBitCounter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter an integer: ");
		int n=sc.nextInt();
		int res=BitwiseBitCounter.countSetBits(n);
		System.out.println("Number of set bits: "+res);
		sc.close();
	}
	static int  countSetBits(int n) {
		
		int count=0;
		while(n>0) {
			count+=n&1;
			n>>=1;
		}
		return count;
	}
}

