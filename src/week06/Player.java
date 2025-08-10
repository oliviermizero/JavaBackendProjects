package week06;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private List<Card> hand;
	private int score;
	private String name;
	
	// Constructor
	public Player(String name) {
		this.name = name;
		this.hand = new ArrayList<>();
		this.score = 0;
	}
	
	// Getters
	public List<Card> getHand(){
		return hand;
	}
	
	public int getScore() {
		return score;
	}
	
	public String getName() {
		return name;
	}
	
	// Setters
	public void setScore(int score) {
		this.score = score;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	// Describe method
	public void describe() {
		System.out.println("Player: " + name + " (Score: " + score + ")");
		System.out.println("Cards in hand: ");
		
		for (Card card: hand) {
			card.describe();
		}
	}
	
	// Flip method to remove and return top card from hand
	public Card flip() {
		if (hand.isEmpty()) {
			return null;
		}
		return hand.remove(hand.size() - 1);
	}
	
	// Draw method to take a card from deck and add to hand
	public void draw(Deck deck) {
		Card drawnCard = deck.draw();
		if (drawnCard != null) {
			hand.add(drawnCard);
		}
	}
	
	// Increment score method
	public void incrementScore() {
		score++;
	}
	
}
