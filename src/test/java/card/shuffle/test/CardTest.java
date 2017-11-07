package card.shuffle.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import card.shuffle.classes.Card;
import card.shuffle.classes.Deck;

public class CardTest {
    @Test 
    public void testDeckInitialize() {
    	
        Deck deck = new Deck();
        
        // check deck size
        assertTrue("Deck should have 52 cards", deck.getCards().size() == 52);
        
        // check suits

        // check ranks
        
        
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
    	assertTrue("Deck needs to change size after dealing", + deck.getCards().size() == 30);
    	
    }
}
