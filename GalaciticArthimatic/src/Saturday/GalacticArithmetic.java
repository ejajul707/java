package Saturday;
import java.util.Scanner;

public class GalacticArithmetic {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		long num1=scan.nextLong();
		long num2=scan.nextLong();
		
		long res=galacticAddition( num1,  num2);
		System.out.println(res);
		scan.close();
		
	}
	public static long galacticAddition(long num1, long num2) {
		return num1+num2;
	
	}
}
