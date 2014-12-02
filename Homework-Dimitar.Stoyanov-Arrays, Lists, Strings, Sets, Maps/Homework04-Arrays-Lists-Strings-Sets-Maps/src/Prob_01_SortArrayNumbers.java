import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Prob_01_SortArrayNumbers {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		ArrayList<Integer> numbers = new ArrayList<>();
		
		for (int arrNum = 0; arrNum < n; arrNum++) {
			numbers.add(input.nextInt());
		}
		
		Collections.sort(numbers);
		
		for (Integer integer : numbers) {
			System.out.print(integer + " ");
		}
		
	}
}

