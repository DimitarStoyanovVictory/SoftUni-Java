import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Prob_04_LongestIncreasingSequence {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(
	            new InputStreamReader(System.in));
		String inputStr = input.readLine();
		String[] arrSplit = inputStr.split(" ");
		int[] numbers = new int[arrSplit.length];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(arrSplit[i]);
		}
		int count = 1;
		int maxSeq = 0;
		int index = 0;

		for (int i = 0; i < numbers.length - 1; i++) {
			if (Integer.compare(numbers[i], numbers[i+1]) < 0 && i == 0) {
				count++;
				System.out.printf("%s %s ", numbers[i], numbers[i+1]);
			}
			else if (Integer.compare(numbers[i], numbers[i+1])  < 0) {
				count++;
				System.out.print(numbers[i+1] + " ");
			}
			else if (Integer.compare(numbers[i], numbers[i+1])  >= 0 && i == 0) {
				System.out.println(numbers[i]);
				System.out.print(numbers[i+1] + " ");
				count = 1;
			}		
			else if (Integer.compare(numbers[i], numbers[i+1])  >= 0) {
				count = 1;
				System.out.println();
				System.out.print(numbers[i+1] + " ");
			}
			if (count > maxSeq) {
				index = i+1;
				maxSeq = count;
			}
		}
		System.out.println();
		
		System.out.print("Longest: ");
		
		int position = maxSeq-1;
		for (int i = 0; i < maxSeq; i++) {
			System.out.printf("%s ", numbers[index-position]);
			position--;
		}
	}
}
