package financialApp;

import java.util.Scanner;

public class FinancialApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter your amount " );
		double amount=scan.nextDouble();
		System.out.printf("%.2f",halveTheNumber(amount));
		scan.close();
	}
	public static double halveTheNumber(double num) {
		return num/2;
		
	}
}
