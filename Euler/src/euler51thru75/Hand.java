package euler51thru75;

import java.util.Arrays;

public class Hand {
	
	private Card[] cards;
	
	int[] suits;
	int[] ranks;
	boolean straight = false;
	boolean flush = false;
	int value;
	

	public Hand (Card[] cds){
		this.cards = cds.clone();
		suits = new int[4];
		ranks = new int[15];
		
		for (Card c : cards) {
			suits[c.suit]++;
			if (suits[c.suit] == 5) flush = true;
		}
		
		for (Card c : cards) {
			ranks[c.rank]++;
			if (c.rank == 14) ranks[1]++;
		}
		
		evaluate();
		
	}
	
	public String name() {
		evaluate();
		
		switch (value) {
		case 9: return "royal flush";
		case 8: return "straight flush";
		case 7: return "four of a kind";
		case 6: return "full house";
		case 5: return "flush";
		case 4: return "straight";
		case 3: return "three of a kind";
		case 2: return "two pairs";
		case 1: return "one pair";
		case 0: return "high card";	
		default: return "error";
		}
			
	}
	
	public void evaluate() {

		for (int i = 1; i <= 10 && !straight; i++) {
			if (ranks[i] == 1 && ranks[i + 1] == 1 && ranks[i + 2] == 1 && ranks[i + 3] == 1 && ranks[i + 4] == 1) {
				straight = true;
			}
		}
		
		if (straight && flush) {
			if (ranks[14] == 1) {
				value = 9;
				return;
			}
			
			value = 8; // value of straight flush is 8;
			return;
		}
		

		
		int[] ranksCopy = ranks.clone();
		ranksCopy[1] = 0;
		Arrays.sort(ranksCopy);
		
		if (ranksCopy[14] == 4) {
			value = 7;
			return;
		}
		
		if (ranksCopy[14] == 3 && ranksCopy[13] == 2) {
			value = 6;
			return;
		}
		
		if (flush) {
			value = 5;
			return;
		}
		
		if (straight) {
			value = 4;
			return;
		}
		
		if (ranksCopy[14] == 3) {
			value = 3;
			return;
		}
		
		if (ranksCopy[14] == 2) {
			if (ranksCopy[13] == 2) {
				value = 2;
				return;
			}
			value = 1;
			return;
		}
		
		value = 0;		
	}
	
	public int compareTo(Hand otherHand) {
		
		final int thisHandWins = 1;
		final int otherHandWins = -1;
		
		int winningNumber = 99;
		
		if (value == 0 || value == 8 || value == 4 || value == 5) {
			winningNumber = 1;
		}
		else if (value == 7) {
			winningNumber = 4;
		}
		else if (value == 6 || value == 3) {
			winningNumber = 3;
		}
		else if (value == 2 || value == 1) {
			winningNumber = 2;
		}
		
		if (this.value == otherHand.value) {
			
				for (int i = 14; i > 1; i-- ) {
					if (this.ranks[i] == otherHand.ranks[i]) continue;
					if (this.ranks[i] == winningNumber) {
						return thisHandWins;
					}
					if (otherHand.ranks[i] == winningNumber) {
						return otherHandWins;
					}
				}

		}

		return this.value - otherHand.value;
	}
		
	
	
}
