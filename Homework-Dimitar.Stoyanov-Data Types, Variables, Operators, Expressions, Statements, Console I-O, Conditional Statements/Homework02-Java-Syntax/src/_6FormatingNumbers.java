import java.util.Scanner;


public class _6FormatingNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		System.out.format("|%-10s|%010d|%10.2f|%-10.3f|", Integer.toHexString(a).toUpperCase(), Integer.parseInt(Integer.toBinaryString(a)), b, c);
	}
}
