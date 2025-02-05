package Numbers;
public class Averageprices {
	public static void main(String[] args) {
		double[] prices = {10.5, 20.0, 30.25, 40.75};
		double sum = 0.0;
		// Calculate sum of prices
		for (double price : prices) {
			sum += price;
		}
		// Calculate average
		double average = sum / prices.length;
		System.out.println("Average Price: " + average);
	}
}
