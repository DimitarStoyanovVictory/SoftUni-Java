import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Prob_08_SumNumbersFromTextFile {

	public static void main(String[] args) {
		
		File file = new File("input.txt");
		Scanner fileReader;
		try {
			fileReader = new Scanner(file);
			int sum = 0;
			
			while (fileReader.hasNextLine()) {
				sum += fileReader.nextInt();
				} 
			}
		catch (FileNotFoundException e) {
			System.out.println("Error");
			e.printStackTrace();
		}
	}
}
