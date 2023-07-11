package JourneyCalculator;

public class JourneyCalculatorApp {

	public static void main(String[] args) {
		JourneyCalculator journeyCalculator = new JourneyCalculator();

		System.out.printf("%.2f",journeyCalculator.calculateDistance(60.0, 1.5));
	}

}

class JourneyCalculator{
	public double calculateDistance(double speed, double time) {
		return speed*time;
		
		
	}
}
