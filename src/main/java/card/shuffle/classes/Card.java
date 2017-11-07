package card.shuffle.classes;

/**
 * Represents a single card that contains a suit and a rank
 * 
 * @author kyle
 *
 */
public class Card {
	
	public Suits suit;
	
	public Ranks rank;
	
	public Card(Suits suit, Ranks rank) {
		
		this.suit = suit;
		
		this.rank = rank;
		
	}
	
}
