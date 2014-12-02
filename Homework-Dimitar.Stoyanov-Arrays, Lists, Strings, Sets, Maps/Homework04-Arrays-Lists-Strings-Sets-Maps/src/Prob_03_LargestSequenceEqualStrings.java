import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Prob_03_LargestSequenceEqualStrings {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(
	            new InputStreamReader(System.in));
		String inputStr = input.readLine();
		String[] arrSplit = inputStr.split(" ");
		
		int count = 1;
		int maxSeq = 0;
		String greatStr = "";
		
		for (int i = 0; i < arrSplit.length - 1; i++) {
			if (arrSplit[i].equals(arrSplit[i + 1])) {
				count++;
			}
			else if (!(arrSplit[i].equals(arrSplit[i + 1]))) {
				count = 1;
			}
			if (count > maxSeq) {
				greatStr = arrSplit[i];
				maxSeq = count;
			}
		}
		
		if (arrSplit.length == 1) {
			System.out.println(arrSplit[0]);
		}
		
		for (int i = 0; i < maxSeq; i++) {
			System.out.print(greatStr + " ");
		}
	}
}
