import java.math.BigDecimal;
import java.util.Scanner;

public class Prob_05_AngleUnitConverter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String forN = input.nextLine();
		int n = Integer.parseInt(forN);
		
		String[] array = new String[n];
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextLine();
		}
		
		int index = 0;
		for (String string : array) {
			if (string.indexOf("rad") > -1) {
				index = string.indexOf("rad");
				double number = Double.parseDouble(string.substring(0, index -1));
				System.out.format("%.6f deg%n", Math.toDegrees(number));
			}
			else if (string.indexOf("deg") > -1) {
				index = string.indexOf("deg");
				double number = Double.parseDouble(string.substring(0, string.indexOf("deg")-1));
				System.out.format("%.6f rad%n", Math.toRadians(number));
			}
		}
	}
}
