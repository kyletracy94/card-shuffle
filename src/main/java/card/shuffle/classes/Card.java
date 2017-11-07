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
	
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Card other = (Card) obj;
        if (rank != other.rank)
            return false;
        if (suit != other.suit)
            return false;
        return true;
    }


}
