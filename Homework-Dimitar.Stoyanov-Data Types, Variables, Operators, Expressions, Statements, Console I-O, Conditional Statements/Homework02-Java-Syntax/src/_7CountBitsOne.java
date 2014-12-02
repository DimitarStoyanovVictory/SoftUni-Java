import java.util.Scanner;

public class _7CountBitsOne {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		char[] binary = Integer.toBinaryString(n).toCharArray();
		int count = 0;
	
		for (int i = 0; i < binary.length; i++) {
			if (binary[i] == '1') {
				count++;
			}
		}
		System.out.println(count);
	}
}
