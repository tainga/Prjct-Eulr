package euler51thru75;

import java.util.Arrays;

public class Tester {

	public static void main(String[] args) {
	
		//Card c1 = new Card("JS");
		//Card c2 = new Card("6D");
		
		Card[] cards = {new Card("TS"), new Card("6D"), new Card("3S"), new Card("AS"), new Card("AC")};
		//Card[] cards1 = {new Card("5D"), new Card("5D"), new Card("5D"), new Card("QD"), new Card("5D")};
		
		Hand h = new Hand(cards);
		//Hand h1 = new Hand(cards1);
		
		//System.out.println(h.compareTo(h1));
		System.out.println(h.name());
		System.out.println(Arrays.toString(h.ranks));

	}

}
