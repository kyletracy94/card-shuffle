package card.shuffle.classes;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Properties;
import java.util.Random;


/**
 * This object is a representation of a Deck. Holds up to 52 Cards
 * 
 * @author kyle
 *
 */
public class Deck implements CardOperations {
	
	private ArrayList<Card> cards = new ArrayList<Card>();
	
	private Properties prop = new Properties();
	
	public ArrayList<Card> getCards() {
		return cards;
	}

	public void setCards(ArrayList<Card> cards) {
		this.cards = cards;
	}

	/**
	 * Deck Constructor
	 */
	public Deck() {
		
		// Initialize the deck
		for(Suits suit : Suits.values()) {
			for(Ranks rank : Ranks.values()) {
				cards.add(new Card(suit, rank));
			}
		}
		
		try {
			
			prop.load(new FileInputStream("src/main/resources/card-shuffle.properties"));
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}
		
	}
	
	/**
	 * Method to shuffle a deck of cards
	 */
	@Override
	public void shuffle() {
		
		// the higher the count the more shuffled the deck
		Integer shuffleCount = Integer.valueOf(prop.getProperty("shuffle.count"));
		System.out.println("Shuffle count is:       " + shuffleCount);
		// seed random
		Random rand = new Random();
		
		// loop through the shuffle count. swap two random cards from deck with
		// each other. This should ensure that most cards have been swapped
		for(int i = 0; i < shuffleCount; i++) {
			
			int n = rand.nextInt(cards.size()-1) + 0;
			
			int m = rand.nextInt(cards.size()-1) + 0;
			
			Collections.swap(cards, n, m);
			
		}
		
	}

	@Override
	public Card deal_one_card() {
		
		if(cards.size() > 0) {
			
			Card card = cards.get(cards.size()-1);
			
			cards.remove(cards.size()-1);
			
			return card;
			
		} else {
			
			return null;
			
		}

	}
	
}
