package card.shuffle.run;

import java.util.Iterator;
import java.util.Map;

import card.shuffle.classes.Card;
import card.shuffle.classes.Deck;

public class DeckTestRun {
	public static void main(String args[]) {
		
		// initialize deck
		Deck deck = new Deck();
		
		// check every card in deck
/*		for(Card card : deck.cards) {
			System.out.print(card.rank + " ");
			System.out.println(card.suit);
		}*/
		
		for(Integer key : deck.cardMap.keySet()) {
			System.out.print(key + ": ");
		}
		
		for(Card value : deck.cardMap.values()) {
			System.out.println(value.rank + " ");
			System.out.println(value.suit);
		}
		
		// shuffle deck
		
		// deal card
		
		// check deck count
		
		// shuffle deck
		
		
		
	}
}
