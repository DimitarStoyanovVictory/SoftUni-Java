import java.util.Scanner;


public class _3PointsInsideFigure {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		if (x <= 22.5 && x >= 12.5 && y >= 6 && y <= 8.5) {
			System.out.println("Inside");
		}
		else if (x <= 17.5 && x >= 12.5 && y >= 8.5 && y <= 13.5) {
			System.out.println("Inside");
		}
		else if (x <= 22.5 && x >= 20 && y >= 8.5 && y <= 13.5) {
			System.out.println("Inside");
		}
		else {
			System.out.println("Outside");
		} 
	}
}
