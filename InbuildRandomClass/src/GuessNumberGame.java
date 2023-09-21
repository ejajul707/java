import java.util.Random;
import java.util.Scanner;
public class GuessNumberGame {

	public static void main(String[] args) {
		Random ran=new Random();
		Scanner sc=new Scanner(System.in);
		
		
		int x=ran.nextInt(101);
		
		int count=0;
		while(true) {
			int n=sc.nextInt();
			count++;
			if (n==x) {
				
				System.out.println("you guess the right number at "+count+" times");
				break;
			}
			else if(n>x) {
				System.out.println("your entered number is too greather! please inter smaller number");
			}
			else {
				System.out.println("your entered number is too small! please inter greater number ");
			}
		}
		sc.close();
	}

}
