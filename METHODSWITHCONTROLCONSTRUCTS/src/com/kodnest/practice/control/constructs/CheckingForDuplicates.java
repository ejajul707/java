//Question 10: Checking for Duplicates
//
//Olivia wants to ensure there are no duplicate elements in a list. Write a Java program to help Olivia check if an array contains any duplicate elements.
//
//Hint: Use nested loops to compare each element with every other element. If two elements are the same, indicate that duplicates are present.

package com.kodnest.practice.control.constructs;

import java.util.Scanner;

public class CheckingForDuplicates {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("how many number are there");
		int arr[] = new int[sc.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("enter the number at " + i);
			arr[i] = sc.nextInt();
		}
		CheckingForDuplicates.checkDubli(arr);
		
	}
	public static void checkDubli( int arr[]){
		int count =0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j <arr.length; j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
				
			}
			
		}
		if(count==1) {
			System.out.println("dublicate element is present");
		}
		else {
			System.out.println("no dublicate elements are present");
		}
	}
}


