import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Prob_02_SequanceEqulStrings {

	public static void main(String[] args) throws IOException {
		
		BufferedReader input = new BufferedReader(
	            new InputStreamReader(System.in));
		String inputStr = input.readLine();
		String[] arrSplit = inputStr.split(" ");
		
		if (arrSplit.length == 1) {
			System.out.println(arrSplit[0]);
		}
		
		for (int i = 0; i < arrSplit.length - 1; i++) {
			if (arrSplit[i].equals(arrSplit[i + 1]) && i == 0) {
				System.out.print(arrSplit[i] + " " + arrSplit[i+1] + " ");
			}
			else if (!(arrSplit[i].equals(arrSplit[i + 1])) && i == 0) {
				System.out.println(arrSplit[i]);
				System.out.print(arrSplit[i+1] + " ");
			}
			else if (arrSplit[i].equals(arrSplit[i+1])) {
				System.out.print(arrSplit[i + 1] + " ");
			}
			else {
				System.out.println();
				System.out.print(arrSplit[i+1] + " ");
			}
		}
	}
}
