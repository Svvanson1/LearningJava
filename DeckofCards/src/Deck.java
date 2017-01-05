import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {



	Random rndm = new Random();
	
	
	public static ArrayList<Card> shuffleDeck(ArrayList<Card> deck) {
	Collections.shuffle(deck);
	return deck;
	}//end shuffleDeck method
	
	public static ArrayList<Card> dealCards1(ArrayList<Card> deck) {
		ArrayList<Card> player1 = new ArrayList<Card>();
		for (int i = 0; i < 27; i++) { //deals first player
			player1.add(i, deck.get(i));
		}//end first deck for loop
		return player1;
	}//end dealCards2 method
	
	public static ArrayList<Card> dealCards2(ArrayList<Card> deck) {
		ArrayList<Card> player2 = new ArrayList<Card>();
		for (int i = 26; i < 53; i++) { //deals first player
			for (int n = 0; n < 27; n++) {
			player2.add(n, deck.get(i));
			}//ends sub loop to make sure that the first 27 card are assigned to player2
		}//end first deck for loop
		return player2;
	}//end dealCards2 method
	
	public static String playWar(ArrayList<Card> player1, ArrayList<Card> player2) {
		int numWars = 0;
		int numRounds = 0;
		
		while (player1.size() != 0 && player2.size() != 0) {
			if (player1.get(0).number > player2.get(0).number) {//If player1 wins
				player1.add(player2.get(0));//Add first card to last
				player2.remove(0);//Remove loser
				numRounds++;
			}
			else if (player2.get(0).number > player1.get(0).number) {//If player2 wins
				player2.add(player1.get(0));//Add first card to last
				player1.remove(0);//Remove loser
				numRounds++;
			}
			
			else if (player1.get(0).number == player2.get(0).number) {//If there's a war
				System.out.println("Two cards equal");
				if (player1.get(1).number > player2.get(1).number) {//If player1 wins
					player1.add(player2.get(0));//Add first card to last
					player1.add(player2.get(1));//Add second card to last
					player2.remove(0);//Remove loser
					player2.remove(1);//Remove loser
					numRounds++;
				}
				if (player2.get(1).number > player1.get(1).number) {//If player2 wins
					player2.add(player1.get(0));//Add first card to last
					player2.add(player1.get(1));//Add second card to last
					player1.remove(0);//Remove loser
					player1.remove(1);//Remove loser
					numRounds++;
				}
				numWars++;
			}//end war if
			else {
				System.out.println("Not working");
			}
		
		}//end while
		
		if (player1.size() == 0) {
			return "Player 2 wins after " + numRounds + " rounds, and " + numWars + " wars.";
		}
		if (player2.size() == 0) {
			return "Player 2 wins after " + numRounds + " rounds, and " + numWars + " wars.";
		}
		else {
			return "did not work";
		}

	}//end playwar method
	
}//End class



