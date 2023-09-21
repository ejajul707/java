package com.method.with.oprators;

import java.util.Scanner;

public class TaxCalculator {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the purchase amount ");
		double amount=sc.nextDouble();
		System.out.println("Enter the tax rate ");
		double tax=sc.nextDouble();
		TaxCalcu tx=new TaxCalcu();
		double res=tx.calculateTotalWithTax(amount, tax);
		System.out.println("Total cost including tax: "+res);
		sc.close();
	}
}
	class TaxCalcu{
	double calculateTotalWithTax(double amount,double tax) {
		double taxAmt=amount*tax;
		double total=amount+taxAmt;
		return total;
	}
}
