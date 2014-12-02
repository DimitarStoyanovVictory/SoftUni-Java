import java.util.Scanner;


public class _2TriangleArea {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		int y = input.nextInt();
		int x2 = input.nextInt();
		int y2 = input.nextInt();
		int x3 = input.nextInt();
		int y3 = input.nextInt();
		
		int area = Math.abs((x * (y2 - y3)) + (x2 * (y3 - y)) + (x3 * (y - y2))) / 2;
		System.out.println(area);
	}
}
