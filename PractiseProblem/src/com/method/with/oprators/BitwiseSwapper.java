package com.method.with.oprators;

import java.util.Scanner;

public class BitwiseSwapper {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter first number");
		int first=sc.nextInt();
		System.out.println("enter secound number");
		int secound=sc.nextInt();
		Swapper swapper= new Swapper();
		swapper.swapUsingBitwise(first, secound);
		sc.close();

	}

}
class Swapper{
	void swapUsingBitwise(int first,int secound){
		System.out.println(first);
		System.out.println(secound);
		first=first^secound;
		secound=first^secound;
		first=first^secound;
		System.out.println("first number is: "+first);
		System.out.println("secound number is: "+secound);
		
				
	}
}