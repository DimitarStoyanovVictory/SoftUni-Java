import java.util.Scanner;

public class Prob_01_SymmetricNumbersInRange {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		short start = input.nextShort();
		short end = input.nextShort();
		
		for (short i = start; i <= end ; i++) {
			if (i % 10 == 0 && i < 10) {
				System.out.print(i + " ");
			}
			else if (i % 10 == i / 10 && i < 100) {
				System.out.print(i + " ");
			}
			else if (i % 10 == i /100) {
				System.out.print(i + " ");
			}
		}	
	}
}
