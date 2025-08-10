package week06;

public class App {

	public static void main(String[] args) {
		System.out.println("--- Welcome to the Automated WAR Card Game ---\n");
		
		// Instantiating deck and two players
		Deck deck = new Deck();
		Player player1 = new Player("Player 1");
		Player player2 = new Player("Player 2");
		
		// Shuffle the deck
		deck.shuffle();
		System.out.println("Deck shuffled!\n");
		
		// Deal card to each player
		System.out.println("Dealing cards...");
		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				player1.draw(deck);
			} else {
				player2.draw(deck);
			}
		}
		
		System.out.println("Cards dealt! Each player has 52 cards.\n");
		System.out.println("--- Let the WAR begin! ---\n");
		
		// Play 26 rounds 
		// Flip and compare cards
		for (int round = 1; round <= 26; round++) {
			System.out.println("--- Round " + round + " ---");
			
			// Each player flips their top card
			Card card1 = player1.flip();
			Card card2 = player2.flip();
			
			// Display the cards
			System.out.println(player1.getName() + " flips: ");
			card1.describe();
			
			System.out.println(player2.getName() + " flips: ");
			card2.describe();
			
			// Compare values and award points
			if (card1.getValue() > card2.getValue()) {
				player1.incrementScore();
				System.out.println("->" + player1.getName() + " wins this round!");
				
			} else if (card2.getValue() > card1.getValue()) {
				player2.incrementScore();
				System.out.println("->" + player2.getName() + " wins this round!");
				
			} else {
				System.out.println("-> It's a tie! No points awarded.");
			}
			
			// Display current scores
			System.out.println("Current score - " + player1.getName() + ": " + 
			player1.getScore() + ", " + player2.getName() + ": " + player2.getScore());
			
			System.out.println();

		}
		
		// Determine and announce the winner
		System.out.println("--- GAME OVER ---");
		System.out.println("Final Scores: ");
		System.out.println(player1.getName() + ": " + player1.getScore());
		System.out.println(player2.getName() + ": " + player2.getScore());
		
		if (player1.getScore() > player2.getScore()) {
			System.out.println(player1.getName() + " WINS!");
		} else if (player2.getScore() > player1.getScore()) {
			System.out.println(player2.getName() + " WINS!");
		} else {
			System.out.println("It's a DRAW!");
		}
	}

}
