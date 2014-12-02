import java.math.BigDecimal;
import java.util.Scanner;

public class Prob_07_DaysBetweenTwoDates {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String date1 = input.nextLine();
		String date2 = input.nextLine();

		String parts1[] = date1.split("-");
		String parts2[] = date2.split("-");
		
		double day1 = Double.parseDouble(parts1[0]);
		double day2 = Double.parseDouble(parts2[0]);
		
		double month1 = Double.parseDouble(parts1[1]);
		double month2 = Double.parseDouble(parts2[1]);
		
		double year1 = Double.parseDouble(parts1[2]);
		double year2 = Double.parseDouble(parts2[2]);
		
		double years = (year2 - year1) * 365.2425;
		double months = (month2 - month1) * 29;
		double days = day2 - day1;
		double result = years + months + days;
		System.out.println(result);
	}
}
	