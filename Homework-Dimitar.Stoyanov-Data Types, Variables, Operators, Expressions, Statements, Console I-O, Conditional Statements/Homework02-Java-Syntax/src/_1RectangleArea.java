import java.util.Scanner;

public class _1RectangleArea {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int firstNumber = input.nextInt();
		int secondNumber = input.nextInt();
		int area = firstNumber * secondNumber;
		System.out.println(area);
	}
}
