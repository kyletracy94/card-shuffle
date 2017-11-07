package card.shuffle.run;


import card.shuffle.classes.Card;
import card.shuffle.classes.Deck;

/**
 * 
 * @author kyle
 *
 */
public class DeckTestRun {
	public static void main(String args[]) {
		
		// initialize deck
		Deck deck = new Deck();
		
		// check every card in deck
		for(Card card : deck.getCards()) {
			System.out.print(card.rank + " ");
			System.out.println(card.suit);
		}

		// shuffle deck
		
		// deal card
/*		for(int i = 0; i < 10; i++) {
			System.out.println("testing dealing cards ==================");
			Card card = deck.deal_one_card();
			System.out.print(card.rank + " ");
			System.out.println(card.suit);
		}
		
		System.out.println("Now print every card in deck");
		System.out.println(deck.cards.size());
		
		// check every card in deck
		for(Card card : deck.cards) {
			System.out.print(card.rank + " ");
			System.out.println(card.suit);
		}*/
		
		deck.shuffle();
		
		System.out.println("testing shuffle");
		
		// check every card in deck
		for(Card card : deck.getCards()) {
			System.out.print(card.rank + " ");
			System.out.println(card.suit);
		}
		
		
		// check deck count
		
		// shuffle deck
		
		
		
	}
}
