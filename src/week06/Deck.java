package week06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<Card> cards;
	
	// Constructor to populate deck with 52 cards
	public Deck() {
		cards = new ArrayList<>();
		String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
		String[] ranks = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
				"Nine", "Ten", "Jack", "Queen", "King", "Ace"};
		
		for (String suit : suits) {
			for (int i = 0; i < ranks.length; i++) {
				int value = i + 2;
				String name = ranks[i] + " of " + suit;
				cards.add(new Card(value, name));
			}
		}
	}

	// Getter for cards
	public List<Card> getCards(){
		return cards;
	}
	
	// Shuffle method
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	// Draw method to remove and return top card
	public Card draw() {
		if (cards.isEmpty()){
			return null;
		}
		return cards.remove(cards.size() - 1);
	}
}
