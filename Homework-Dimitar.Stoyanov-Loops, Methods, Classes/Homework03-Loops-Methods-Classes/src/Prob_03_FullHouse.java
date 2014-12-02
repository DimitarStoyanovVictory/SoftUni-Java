
public class Prob_03_FullHouse {

	public static void main(String[] args) {
		
		char[] suits = {'♣', '♦', '♥', '♠'};
		String[] cards = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
		int count = 0;
		
		for (int left = 0; left < cards.length; left++) {
			for (int right = 0; right < cards.length; right++) {
				if (left == right) {
					continue;
				}
				for (int s1 = 0; s1 < suits.length; s1++) {
					for (int s2 = s1+1; s2 < suits.length; s2++) {
						for (int s3 = s2+1; s3 < suits.length; s3++) {
							for (int s4 = 0; s4 < suits.length; s4++) {
								for (int s5 = s4+1; s5 < suits.length; s5++) {
									count++;
									System.out.print(cards[left]);
									System.out.print(suits[s1] + " ");
									System.out.print(cards[left]);
									System.out.print(suits[s2] + " ");
									System.out.print(cards[left]);
									System.out.print(suits[s3] + " ");
									System.out.print(cards[right]);
									System.out.print(suits[s4] +  " ");
									System.out.print(cards[right]);
									System.out.print(suits[s5] + " ");
									System.out.println();
								}
							}
						}
					}
				}
			}
		}
		System.out.println(count);
	}
}
