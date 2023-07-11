package TimeConverter;

import java.util.Scanner;

public class TimeConverterApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter your working time in minutes");
		int min=scan.nextInt();
		System.out.println(convertToHours(min));
		scan.close();
	}
	public static double convertToHours(int minutes) {
		return minutes/60.0;
	}

}
