package com.method.with.oprators;

import java.util.Scanner;

public class LogicalOperatorValidator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a valid input");
		boolean valid=sc.nextBoolean();
		System.out.println("enter a invalid input");
		boolean invalid=sc.nextBoolean();
		LogicOprator logicOprator=new LogicOprator();
		logicOprator.isValidInput(valid, invalid);
		sc.close();
	}

}
class LogicOprator{
	void isValidInput(boolean valid,boolean invalid) {
		boolean v=valid&&invalid;
		System.out.println(v);
		boolean i=valid||invalid;
		System.out.println(i);
	}
}