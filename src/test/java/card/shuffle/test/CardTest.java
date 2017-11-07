package card.shuffle.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import card.shuffle.classes.Card;
import card.shuffle.classes.Deck;
import card.shuffle.classes.Suits;

public class CardTest {
    @Test 
    public void testDeckInitialize() {
    	
        Deck deck = new Deck();
        
        // check deck size
        assertTrue("Deck should have 52 cards", deck.getCards().size() == 52);
        
        //Check correct number of suits
        Integer clubs = 0;
        for(Card card : deck.getCards()) {
            if(card.suit == Suits.CLUBS) {
                clubs++;
            }
        }
        
        assertTrue("Clubs should have 13 cards in suit", clubs == 13);
        
        //Check correct number of suits
        Integer spades = 0;
        for(Card card : deck.getCards()) {
            if(card.suit == Suits.SPADES) {
                spades++;
            }
        }
        
        assertTrue("Spades should have 13 cards in suit", spades == 13);
        
        //Check correct number of suits
        Integer diamonds = 0;
        for(Card card : deck.getCards()) {
            if(card.suit == Suits.DIAMONDS) {
                diamonds++;
            }
        }
        
        assertTrue("Diamonds should have 13 cards in suit", diamonds == 13);
        
        //Check correct number of suits
        Integer hearts = 0;
        for(Card card : deck.getCards()) {
            if(card.suit == Suits.HEARTS) {
                hearts++;
            }
        }
        
        assertTrue("Hearts should have 13 cards in suit", hearts == 13);
        
        

    }
    
    @Test
    public void testDeckDealer() {
    	
    	Deck deck = new Deck();
    	
    	Card card = deck.deal_one_card();
    	
    	// check that the deck has 51 cards now
    	assertTrue("Deck should have one less card than before", deck.getCards().size() == 51);
    	
    	// deal one more
    	Card card2 = deck.deal_one_card();
    	
    	// check that the deck has 52 cards now
    	assertTrue("Deck should have one less card than before", deck.getCards().size() == 50);
    	
    	// now make sure the two dealt cards are different
    	assertTrue("Two dealt cards have to be different", card != card2);
    	
    	// now loop through and deal a few cards
    	for(int i = 0; i < 20; i++) {
    		deck.deal_one_card();
    	}
    	
    	// ensure all those cards were dealt
    	assertTrue("Deck needs to change size after dealing", deck.getCards().size() == 30);
    	
    }
    
    @Test
    public void testDeckShuffle() {
        
        Deck deck1 = new Deck();
        
        Deck deck2 = new Deck();
        
        // two newly initialized decks should be identical
        assertTrue("Two new decks should be equal to one another", deck1.equals(deck2) );
        
        // now shuffle one deck and leave the other one unshuffled
        deck1.shuffle();
        
        // now check equality
        assertFalse("The decks should now not equal one another", deck1.equals(deck2));
        
        
    }
}
