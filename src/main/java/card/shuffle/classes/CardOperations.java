package card.shuffle.classes;

/**
 * Interface that holds the required operations performed on a Deck
 * 
 * @author kyle
 *
 */
public interface CardOperations {

	public void shuffle();
	
	public Card deal_one_card(); 
}
