import java.util.Scanner;

public class _8CountEqualPairBits {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		char[] binary = Integer.toBinaryString(input.nextInt()).toCharArray();
		int count = 0;
		for (int i = 0; i < binary.length - 1; i++) {
			if (binary[i] == binary[i + 1]) {
				count++;
			}
		}
		System.out.println(count);
	}
}
