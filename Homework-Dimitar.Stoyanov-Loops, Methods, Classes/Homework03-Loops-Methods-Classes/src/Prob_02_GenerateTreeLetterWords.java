import java.util.Scanner;
import java.util.Arrays;

public class Prob_02_GenerateTreeLetterWords {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		char[] letters = input.next().toCharArray();
		Arrays.sort(letters);
		if (letters.length == 1 || (letters[0] == letters[1] && letters[1] == letters[2])) {
			System.out.println("" + letters[0] + letters[0] + letters[0]);
		}
		else {
			for (byte d1 = 0; d1 < letters.length; d1++) {
				for (byte d2 = 0; d2 < letters.length; d2++) {
					for (byte d3 = 0; d3 < letters.length; d3++) {
						System.out.print("" + letters[d1] + letters[d2] + letters[d3] + " ");
					}
				}
			}	
		}
	}
}
