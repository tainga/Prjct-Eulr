package euler51thru75;

public class Card {
	
	public int suit;
	public int rank;
	
	public Card(String initials) {
		char r = initials.charAt(0);
		char s = initials.charAt(1);
		
		if (r >= '2' && r <= '9') {
			rank = r - 48;
		} else {
			if (r == 'T') rank = 10;
			else if (r == 'J') rank = 11;
			else if (r == 'Q') rank = 12;
			else if (r == 'K') rank = 13;
			else if (r == 'A') rank = 14;
		}
		
		if (s == 'C') suit = 0;
		else if (s == 'S') suit = 1;
		else if (s == 'D') suit = 2;
		else if (s == 'H') suit = 3;

	}
	
	public int compareTo(Card otherCard) {
		if (rank > otherCard.rank) return -1;
		else if (rank == otherCard.rank) return 0;
		else return 1;
	}
	
	
	

}
