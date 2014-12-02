import java.util.Scanner;
import java.util.Arrays;

public class SortArrayOfStrings {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String[] array = new String[n];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = input.next();
		}
		
		Arrays.sort(array);
		
		for (String string : array) {
			System.out.println(string);
		}
	}
}
