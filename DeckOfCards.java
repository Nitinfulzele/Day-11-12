import java.util.*;

public class DeckOfCards {

	public static void main(String[] args) {
		int count = 0;
		int j = 0;
		String suitsandcards[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15",
				"16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32",
				"33", "34", "35", "36", };
		Random rand = new Random();
		String[] Suit = { "Clubs", "Diamonds", "Hearts", "Spades" };
		String[] Cards = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

		while (count < 36) {
			int print = 0;
			int x = rand.nextInt(4);
			int y = rand.nextInt(13);
			String check = Suit[x] + " Of " + Cards[y];
			for (int i = 0; i <= j; i++) {
				if (suitsandcards[i] == check) {
					print = 1;
				}
			}
			if (print == 0) {
				suitsandcards[j] = check;

				j++;
				count++;
			}
		}
		int p = 0;
		for (int z = 0; z < 4; z++) {
			for (int v = 0; v < 9; v++) {
				System.out.print("{" + suitsandcards[p] + "}   ");
				p++;
			}
			System.out.println();
		}
	}
}
