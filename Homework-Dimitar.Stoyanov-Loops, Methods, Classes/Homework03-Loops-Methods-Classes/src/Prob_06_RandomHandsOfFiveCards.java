import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;


public class Prob_06_RandomHandsOfFiveCards {

	public static void main(String[] args) {
		ArrayList<String> deck = new ArrayList<String>();
		String[] cards = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
		char[] suits = {'♣', '♦', '♥', '♠'};
		
		for (int suit = 0; suit < suits.length; suit++) {
			for (int card = 0; card < cards.length; card++) {
				deck.add(cards[card] + suits[suit]);
			}
		}
				
		Collections.shuffle(deck);
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int x = 0;
		Random hand = new Random();
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 5; j++) {
				x = hand.nextInt(51);
				System.out.print(deck.get(x) + " ");
			}
			System.out.println();
		}
	}
}
