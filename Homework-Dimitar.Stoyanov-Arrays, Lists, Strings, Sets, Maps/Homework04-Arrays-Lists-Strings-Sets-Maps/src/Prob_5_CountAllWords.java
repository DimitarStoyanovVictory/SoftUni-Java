import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Prob_5_CountAllWords {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String sentance = input.readLine();;
		Pattern wordPatt = Pattern.compile("\\w");
		Matcher words = wordPatt.matcher(sentance);
		
		int count = 0;
		while (words.find()) {
			count++;
		}
		System.out.println(count);
	}
}
