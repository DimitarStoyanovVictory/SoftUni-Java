import java.util.Scanner;


public class _4SmallestTreeNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		if (a <= b && a <= c) {
			System.out.println(a);
		}
		else if (b <= a && b <= c) {
			System.out.println(b);
		}
		else if (c <= a && c <= b) {
			System.out.println(c);
		}
	}
}
